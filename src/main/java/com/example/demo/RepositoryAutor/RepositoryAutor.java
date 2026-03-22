package com.example.demo.RepositoryAutor;

import com.example.demo.ModelAutor.ModelAutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAutor extends JpaRepository<ModelAutor, Long> {
}
