package ControllerAutor;

import ModelAutor.ModelAutor;
import ServiceAutor.ServiceAutor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class ControllerAutor {
    private final ServiceAutor serviceAutor;

    public ControllerAutor(ServiceAutor serviceAutor){
        this.serviceAutor = serviceAutor;
    }

    @GetMapping
    public List<ModelAutor> listarTodos(){
        return serviceAutor.listar();
    }

    @GetMapping("/{id}")
    public ModelAutor buscarPorId(@PathVariable Long id){
        return serviceAutor.buscarProduto(id);
    }

    @PostMapping
    public void criar(@RequestBody ModelAutor modelProduto){
        serviceAutor.criar(modelProduto);
    }

    @DeleteMapping
    public void remover (@PathVariable Long id){
        serviceAutor.remover(id);
    }
}
