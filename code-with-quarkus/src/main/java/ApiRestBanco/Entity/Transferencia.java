package ApiRestBanco.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "tranferencia")
public class Transferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransferencia;

    @JoinColumn(name = "contaEmitente")
    @OneToOne(fetch = FetchType.LAZY)
    private ContaBancaria contaEmitente;

    @Column(name = "contaRecebimento")
    private ContaBancaria contaRecebimento;

    @Column(name = "BigDecimal")
    private BigDecimal saldo = BigDecimal.ZERO;
}
