package com.example.demo.RepositoryLivros;

import com.example.demo.ModelLivros.ModelLivros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryLivros extends JpaRepository<ModelLivros, Long> {
}
