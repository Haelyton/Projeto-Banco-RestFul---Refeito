package ApiRestBanco.Repository;


import ApiRestBanco.Entity.ContaBancaria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryContaBancaria extends JpaRepository<ContaBancaria, Long> {
}
