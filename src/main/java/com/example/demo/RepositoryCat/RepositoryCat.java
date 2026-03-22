package com.example.demo.RepositoryCat;

import com.example.demo.ModelCat.ModelCat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RepositoryCat extends JpaRepository<ModelCat, Long> {
}
