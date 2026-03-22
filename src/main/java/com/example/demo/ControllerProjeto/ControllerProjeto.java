package com.example.demo.ControllerProjeto;

import com.example.demo.ModelProjeto.ModelProjeto;
import com.example.demo.ServiceProjeto.ServiceProjeto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetos")

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
