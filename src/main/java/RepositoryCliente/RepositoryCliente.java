package RepositoryCliente;

import ModelCliente.ModelCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCliente extends JpaRepository<ModelCliente, Long>{
}
