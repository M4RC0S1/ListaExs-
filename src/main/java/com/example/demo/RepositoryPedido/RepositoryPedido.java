package com.example.demo.RepositoryPedido;

import com.example.demo.ModelPedido.ModelPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPedido extends JpaRepository<ModelPedido, Long> {
}
