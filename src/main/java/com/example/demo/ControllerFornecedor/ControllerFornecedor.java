package com.example.demo.ControllerFornecedor;

import com.example.demo.ModelFornecedor.ModelFornecedor;
import com.example.demo.ServiceFornecedor.ServiceFornecedor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class ControllerFornecedor {
    private final ServiceFornecedor serviceFornecedor;

    public ControllerFornecedor(ServiceFornecedor serviceFornecedor){
        this.serviceFornecedor = serviceFornecedor;
    }

    @GetMapping
    public List<ModelFornecedor> listarTodos(){
        return serviceFornecedor.listar();
    }

    @GetMapping("/{id}")
    public ModelFornecedor buscarPorId(@PathVariable Long id){
        return serviceFornecedor.buscarFornecedor(id);
    }

    @PostMapping
    public void criar(@RequestBody ModelFornecedor modelCat){
        serviceFornecedor.criar(modelCat);
    }

    @DeleteMapping
    public void remover (@PathVariable Long id){
        serviceFornecedor.remover(id);
    }
}
