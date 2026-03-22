package com.example.demo.RepositoryTarefa;

import com.example.demo.ModelTarefa.ModelTarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTarefa extends JpaRepository<ModelTarefa, Long> {
}
