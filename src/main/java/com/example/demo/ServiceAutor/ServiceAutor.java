package com.example.demo.ServiceAutor;

import com.example.demo.ModelAutor.ModelAutor;
import com.example.demo.RepositoryAutor.RepositoryAutor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAutor {
    private final RepositoryAutor repositoryAutor;

    public ServiceAutor(RepositoryAutor repositoryAutor){
        this.repositoryAutor = repositoryAutor;
    }

    public void criar(ModelAutor modelProduto){
        repositoryAutor.save(modelProduto);
    }

    public List<ModelAutor>listar(){
        return repositoryAutor.findAll();
    }

    public ModelAutor buscarProduto(Long id){
        return repositoryAutor.findById(id).orElseThrow(()-> new RuntimeException("Autor com ID " + id + "não encontrado"));
    }

    public void remover(Long id){
        if (repositoryAutor.existsById(id)){
            repositoryAutor.deleteById(id);
        } else {
            throw new RuntimeException("ID" + id + "nao encontrado");
        }
    }
}
