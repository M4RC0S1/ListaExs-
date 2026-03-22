package com.example.demo.ControllerTarefa;

import com.example.demo.ModelTarefa.ModelTarefa;
import com.example.demo.ServiceTarefa.ServiceTarefa;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class ControllerTarefa {
    private final ServiceTarefa serviceTarefa;

    public ControllerTarefa(ServiceTarefa serviceTarefa){
        this.serviceTarefa = serviceTarefa;
    }

    @GetMapping
    public List<ModelTarefa> listarTodos(){
        return serviceTarefa.listar();
    }

    @GetMapping("/{id}")
    public ModelTarefa buscarPorId(@PathVariable Long id){
        return serviceTarefa.buscarTarefa(id);
    }

    @PostMapping
    public void criar(@RequestBody ModelTarefa modelCat){
        serviceTarefa.criar(modelCat);
    }

    @DeleteMapping
    public void remover (@PathVariable Long id){
        serviceTarefa.remover(id);
    }
}
