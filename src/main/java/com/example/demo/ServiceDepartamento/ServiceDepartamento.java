package com.example.demo.ServiceDepartamento;

import com.example.demo.ModelDepartamento.ModelDepartamento;
import com.example.demo.RepositoryDepartamento.RepositoryDepartamento;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDepartamento {
    private final RepositoryDepartamento repositoryDepartamento;

    public ServiceDepartamento(RepositoryDepartamento repositoryDepartamento){
        this.repositoryDepartamento = repositoryDepartamento;
    }

    public void criar(ModelDepartamento modelDepartamento){
        repositoryDepartamento.save(modelDepartamento);
    }

    public List<ModelDepartamento> listar(){
        return repositoryDepartamento.findAll();
    }

    public ModelDepartamento buscarCat(Long id){
        return repositoryDepartamento.findById(id).orElseThrow(()-> new RuntimeException("Departamento com ID " + id + "não encontrado"));
    }

    public void remover(Long id){
        if (repositoryDepartamento.existsById(id)){
            repositoryDepartamento.deleteById(id);
        } else {
            throw new RuntimeException("ID" + id + "nao encontrado");
        }
    }
}
