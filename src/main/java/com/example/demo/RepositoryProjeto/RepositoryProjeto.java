package com.example.demo.RepositoryProjeto;

import com.example.demo.ModelProjeto.ModelProjeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProjeto extends JpaRepository <ModelProjeto, Long> {
}
