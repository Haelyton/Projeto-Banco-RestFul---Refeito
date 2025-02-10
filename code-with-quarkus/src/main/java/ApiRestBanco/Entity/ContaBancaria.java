package ApiRestBanco.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Getter
@Setter
@Entity
@Table(name = "conta_bancaria")
public class ContaBancaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String cpf;

    @Column
    private LocalDate dataNascimento;

    @Column
    private String senha;

    @Column
    private BigDecimal saldo = BigDecimal.ZERO;

}
