package RepositoryDepartamento;

import ModelDepartamento.ModelDepartamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDepartamento extends JpaRepository<ModelDepartamento, Long> {
}
