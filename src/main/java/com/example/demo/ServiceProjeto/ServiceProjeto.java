package com.example.demo.ServiceProjeto;

import com.example.demo.ModelProjeto.ModelProjeto;
import com.example.demo.RepositoryProjeto.RepositoryProjeto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProjeto {
    private final RepositoryProjeto repositoryProjeto;

    public ServiceProjeto(RepositoryProjeto repositoryProjeto){
        this.repositoryProjeto = repositoryProjeto;
    }

    public void criar(ModelProjeto modelProjeto){
        repositoryProjeto.save(modelProjeto);
    }

    public List<ModelProjeto> listar(){
        return repositoryProjeto.findAll();
    }

    public ModelProjeto buscarCat(Long id){
        return repositoryProjeto.findById(id).orElseThrow(()-> new RuntimeException("Projeto com ID " + id + "não encontrado"));
    }

    public void remover(Long id){
        if (repositoryProjeto.existsById(id)){
            repositoryProjeto.deleteById(id);
        } else {
            throw new RuntimeException("ID" + id + "nao encontrado");
        }
    }
}
