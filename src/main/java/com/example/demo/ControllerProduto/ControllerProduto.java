package com.example.demo.ControllerProduto;

import com.example.demo.ModelProduto.ModelProduto;
import com.example.demo.ServiceProduto.ServiceProduto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ControllerProduto {
    private final ServiceProduto serviceProduto;

    public ControllerProduto(ServiceProduto serviceProduto){
        this.serviceProduto = serviceProduto;
    }

    @GetMapping
    public List<ModelProduto> listarTodos(){
        return serviceProduto.listar();
    }

    @GetMapping("/{id}")
    public ModelProduto buscarPorId(@PathVariable Long id){
        return serviceProduto.buscarProduto(id);
    }

    @PostMapping
    public void criar(@RequestBody ModelProduto modelProduto){
        serviceProduto.criar(modelProduto);
    }

    @DeleteMapping
    public void remover (@PathVariable Long id){
        serviceProduto.remover(id);
    }
}
