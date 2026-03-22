package com.example.demo.ServiceTarefa;

import com.example.demo.ModelTarefa.ModelTarefa;
import com.example.demo.RepositoryTarefa.RepositoryTarefa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTarefa {
    private final RepositoryTarefa repositoryTarefa;

    public ServiceTarefa(RepositoryTarefa repositoryTarefa){
        this.repositoryTarefa = repositoryTarefa;
    }

    public void criar(ModelTarefa modelTarefa){
        repositoryTarefa.save(modelTarefa);
    }

    public List<ModelTarefa> listar(){
        return repositoryTarefa.findAll();
    }

    public ModelTarefa buscarTarefa(Long id){
        return repositoryTarefa.findById(id).orElseThrow(()-> new RuntimeException("Tarefa com ID " + id + "não encontrado"));
    }

    public void remover(Long id){
        if (repositoryTarefa.existsById(id)){
            repositoryTarefa.deleteById(id);
        } else {
            throw new RuntimeException("ID" + id + "nao encontrado");
        }
    }
}
