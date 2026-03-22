package com.example.demo.ServiceCat;

import com.example.demo.ModelCat.ModelCat;
import com.example.demo.RepositoryCat.RepositoryCat;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCat {
    private final RepositoryCat repositoryCat;

    public ServiceCat(RepositoryCat repositoryCat){
        this.repositoryCat = repositoryCat;
    }

    public void criar(ModelCat modelCat){
        repositoryCat.save(modelCat);
    }

    public List<ModelCat> listar(){
        return repositoryCat.findAll();
    }

    public ModelCat buscarCat(Long id){
        return repositoryCat.findById(id).orElseThrow(()-> new RuntimeException("Categoria com ID " + id + "não encontrado"));
    }

    public void remover(Long id){
        if (repositoryCat.existsById(id)){
            repositoryCat.deleteById(id);
        } else {
            throw new RuntimeException("ID" + id + "nao encontrado");
        }
    }
}
