package com.example.demo.ServicePedido;

import com.example.demo.ModelPedido.ModelPedido;
import com.example.demo.RepositoryPedido.RepositoryPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ServicePedido {
    public class PedidoService {

        @Autowired
        private RepositoryPedido pedidoRepository;

        public ModelPedido save(ModelPedido pedido) {
            return pedidoRepository.save(pedido);
        }

        public List<ModelPedido> findAllPedidos() {
            return pedidoRepository.findAll();
        }

        public ModelPedido findPedidoById(Long id) {
            return pedidoRepository.findById(id).get();
        }

        public void deletePedido(Long id) {
            pedidoRepository.deleteById(id);
        }
}
}
