package ApiRestBanco.Repository;

import ApiRestBanco.Entity.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryTranfers extends JpaRepository<Transferencia, Long> {
}
