package ControllerCliente;

import ModelCliente.ModelCliente;
import ServiceCliente.ServiceCliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController

public class ControllerCliente {
    private final ServiceCliente serviceCliente;

    public ControllerCliente(ServiceCliente serviceCliente){
        this.serviceCliente = serviceCliente;
    }

    @GetMapping
    public List<ModelCliente> listarTodos(){
        return serviceCliente.listar();
    }

    @GetMapping("/{id}")
    public ModelCliente buscarPorId(@PathVariable Long id){
        return serviceCliente.buscarCat(id);
    }

    @PostMapping
    public void criar(@RequestBody ModelCliente modelCat){
        serviceCliente.criar(modelCat);
    }

    @DeleteMapping
    public void remover (@PathVariable Long id){
        serviceCliente.remover(id);
    }
}
