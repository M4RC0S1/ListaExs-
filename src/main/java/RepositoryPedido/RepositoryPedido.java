package RepositoryPedido;

import ModelPedido.ModelPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryPedido extends JpaRepository<ModelPedido, Long> {
}
