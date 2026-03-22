package com.example.demo.ControllerCat;

import com.example.demo.ModelCat.ModelCat;
import com.example.demo.ServiceCat.ServiceCat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class ControllerCat {
    private final ServiceCat serviceCat;

    public ControllerCat(ServiceCat serviceCat){
        this.serviceCat = serviceCat;
    }

    @GetMapping
    public List<ModelCat> listarTodos(){
        return serviceCat.listar();
    }

    @GetMapping("/{id}")
    public ModelCat buscarPorId(@PathVariable Long id){
        return serviceCat.buscarCat(id);
    }

    @PostMapping
    public void criar(@RequestBody ModelCat modelCat){
        serviceCat.criar(modelCat);
    }

    @DeleteMapping
    public void remover (@PathVariable Long id){
        serviceCat.remover(id);
    }
}
