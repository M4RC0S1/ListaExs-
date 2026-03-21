package ControllerPedido;

import ModelPedido.ModelPedido;
import ServicePedido.ServicePedido;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
public class ControllerPedido {

    @RestController
    @RequestMapping
    public class ControllerLivros {
        private final ServiceLivros serviceLivros;

        public ControllerLivros(ServiceLivros serviceLivros) {
            this.serviceLivros = serviceLivros;
        }

        public ControllerPedido(ServicePedido servicePedido) {
            this.servicePedido = servicePedido;
        }

        @GetMapping
        public List<ModelPedido> listarTodos() {
            return servicePedido.listar();
        }

        @GetMapping("/{id}")
        public ModelPedido buscarPorId(@PathVariable Long id) {
            return servicePedido.buscarPedido(id);
        }

        @PostMapping
        public void criarPedido(@RequestBody ModelPedido modelPedido) {
            servicePedido.criarPedido(modelPedido);
        }

        @DeleteMapping
        public void remover(@PathVariable Long id) {
            servicePedido.remover(id);
        }
    }
}
