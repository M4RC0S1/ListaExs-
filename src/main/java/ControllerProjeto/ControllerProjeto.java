package ControllerProjeto;

import ModelProjeto.ModelProjeto;
import ServiceProjeto.ServiceProjeto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController

public class ControllerProjeto {
    private final ServiceProjeto serviceProjeto;

    public ControllerProjeto(ServiceProjeto serviceProjeto){
        this.serviceProjeto = serviceProjeto;
    }

    @GetMapping
    public List<ModelProjeto> listarTodos(){
        return serviceProjeto.listar();
    }

    @GetMapping("/{id}")
    public ModelProjeto buscarPorId(@PathVariable Long id){
        return serviceProjeto.buscarCat(id);
    }

    @PostMapping
    public void criar(@RequestBody ModelProjeto modelCat){
        serviceProjeto.criar(modelCat);
    }

    @DeleteMapping
    public void remover (@PathVariable Long id){
        serviceProjeto.remover(id);
    }
}
