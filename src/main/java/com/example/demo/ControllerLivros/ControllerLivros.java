package com.example.demo.ControllerLivros;

import com.example.demo.ModelLivros.ModelLivros;
import com.example.demo.ServiceLivros.ServiceLivros;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/livros")
public class ControllerLivros {
    private final ServiceLivros serviceLivros;

    public ControllerLivros(ServiceLivros serviceLivros){
        this.serviceLivros = serviceLivros;
    }

    @GetMapping
    public List<ModelLivros> listarTodos(){
        return serviceLivros.listar();
    }

    @GetMapping("/{id}")
    public ModelLivros buscarPorId(@PathVariable Long id){
        return serviceLivros.buscarLivro(id);
    }

    @PostMapping
    public void criar(@RequestBody ModelLivros modelLivros){
        serviceLivros.criar(modelLivros);
    }

    @DeleteMapping
    public void remover(@PathVariable Long id){
        serviceLivros.remover(id);
    }
}
