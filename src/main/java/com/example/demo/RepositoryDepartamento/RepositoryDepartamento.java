package com.example.demo.RepositoryDepartamento;

import com.example.demo.ModelDepartamento.ModelDepartamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDepartamento extends JpaRepository<ModelDepartamento, Long> {
}
