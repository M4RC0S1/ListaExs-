package com.example.demo.RepositoryFornecedor;

import com.example.demo.ModelFornecedor.ModelFornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryFornecedor extends JpaRepository <ModelFornecedor, Long> {
}
