package com.example.demo.ServiceCliente;

import com.example.demo.ModelCliente.ModelCliente;
import com.example.demo.RepositoryCliente.RepositoryCliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCliente {
    private final RepositoryCliente repositoryCliente;

    public ServiceCliente(RepositoryCliente repositoryCliente){
        this.repositoryCliente = repositoryCliente;
    }

    public void criar(ModelCliente modelCliente){
        repositoryCliente.save(modelCliente);
    }

    public List<ModelCliente> listar(){
        return repositoryCliente.findAll();
    }

    public ModelCliente buscarCat(Long id){
        return repositoryCliente.findById(id).orElseThrow(()-> new RuntimeException("Cliente com ID " + id + "não encontrado"));
    }

    public void remover(Long id) {
        if (repositoryCliente.existsById(id)) {
            repositoryCliente.deleteById(id);
        } else {
            throw new RuntimeException("ID" + id + "nao encontrado");
        }
    }
}
