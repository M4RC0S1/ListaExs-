package RepositoryFornecedor;

import ModelFornecedor.ModelFornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryFornecedor extends JpaRepository <ModelFornecedor, Long> {
}
