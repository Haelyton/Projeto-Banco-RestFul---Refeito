package ApiRestBanco.Service;

import ApiRestBanco.Entity.ContaBancaria;
import ApiRestBanco.Entity.Transferencia;
import ApiRestBanco.Repository.RepositoryContaBancaria;
import ApiRestBanco.Repository.RepositoryTranfers;
import jakarta.xml.bind.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Objects;

@Service
public class TransferService {

    @Autowired
    private RepositoryContaBancaria repositoryContaBancaria;

    @Autowired
    private RepositoryTranfers repositoryTranfers;

    public void realizarTranferencia(Long idEmitente, Long idRecebimento, BigDecimal valor) throws ValidationException, FileNotFoundException {

        if (Objects.isNull(valor) || valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ValidationException("Valor deve ser maior que 0");
        }

        ContaBancaria contaEmitente = repositoryContaBancaria.getOne(idEmitente);
        if (Objects.isNull(contaEmitente)) {
            throw new FileNotFoundException("Conta inexistente");
        }

        ContaBancaria contaRecebimento = repositoryContaBancaria.getOne(idRecebimento);
        if (Objects.isNull(contaRecebimento)) {
            throw new ValidationException("Conta inexistente");
        }

        if (contaRecebimento.getSaldo().compareTo(valor) <= 0) {
            throw new ValidationException("Saldo insuficiente");
        }

        contaEmitente.setSaldo(contaEmitente.getSaldo().subtract(valor));

        contaRecebimento.setSaldo(contaRecebimento.getSaldo().add(valor));


        repositoryContaBancaria.saveAndFlush(contaEmitente);
        repositoryContaBancaria.saveAndFlush(contaRecebimento);

        Transferencia transferencia = new Transferencia();
        transferencia.setContaEmitente(contaEmitente);
        transferencia.setContaRecebimento(contaRecebimento);
        transferencia.setSaldo(valor);

        repositoryTranfers.saveAndFlush(transferencia);
    }

}
