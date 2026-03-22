package com.example.demo.ControllerPedido;

import com.example.demo.ModelPedido.ModelPedido;
import com.example.demo.ServicePedido.ServicePedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("pedidos")
public class ControllerPedido {
        @Autowired
        private ServicePedido.PedidoService pedidoService;

        @PostMapping
        public ResponseEntity<ModelPedido> save(@RequestBody ModelPedido pedido) {
            ModelPedido novoPedido = pedidoService.save(pedido);
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(novoPedido.getId())
                    .toUri();
            return ResponseEntity.created(uri).body(novoPedido);
        }

        @GetMapping
        public ResponseEntity<List<ModelPedido>> findAllPedidos() {
            List<ModelPedido> request = pedidoService.findAllPedidos();

            return ResponseEntity.ok().body(request);
        }

        @GetMapping("/{id}")
        public Optional<ModelPedido> findPedidoById(@PathVariable Long id) {
            return Optional.ofNullable(pedidoService.findPedidoById(id));
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<?> deletePedido(@PathVariable Long id) {
            pedidoService.deletePedido(id);
            return ResponseEntity.noContent().build();
        }
}
