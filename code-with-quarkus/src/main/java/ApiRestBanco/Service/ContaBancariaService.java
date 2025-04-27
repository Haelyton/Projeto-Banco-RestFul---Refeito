package ApiRestBanco.Service;

import ApiRestBanco.Entity.ContaBancaria;
import ApiRestBanco.Repository.RepositoryContaBancaria;
import jakarta.ws.rs.NotFoundException;
import jakarta.xml.bind.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Service
public class ContaBancariaService {

    @Autowired
    private RepositoryContaBancaria repository;

    public void CreateContaBancaria(ContaBancaria conta) throws ValidationException {

        try {
            if (conta.getDataNascimento().getYear() < LocalDate.now().getYear()) {
                throw new ValidationException("Deve ser maior de 18 anos");
            }

            repository.saveAndFlush(conta);
        }catch (ValidationException e){
            throw new ValidationException(e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }
    }




    public void updateContaBancaria(ContaBancaria conta) throws ValidationException {

        try {
            ContaBancaria contaOld = repository.getOne(conta.getId());

            if (Objects.isNull(contaOld)) {
                throw new NotFoundException("Conta inexistente");
            }

            contaOld.setName(conta.getName());
            contaOld.setSaldo(conta.getSaldo());

            repository.saveAndFlush(contaOld);
        }catch (NotFoundException e) {
            throw new NotFoundException(e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public ContaBancaria getContaBancariaGetById(Long id) {

        try {
            ContaBancaria conta = repository.getOne(id);

            if (Objects.isNull(conta)) {
                throw new NotFoundException("Conta inexistente");
            }

            conta.setSenha(null);
            return conta;
        }catch (NotFoundException e) {
            throw new NotFoundException(e.getMessage());
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public boolean verificarSaldo (Long id, BigDecimal saldo) {
        ContaBancaria conta = getContaBancariaGetById(id);
        return conta.getSaldo().compareTo(saldo) >= 0;
    }
}
