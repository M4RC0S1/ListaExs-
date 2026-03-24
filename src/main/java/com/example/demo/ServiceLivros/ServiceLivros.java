package com.example.demo.ServiceLivros;

import com.example.demo.ModelLivros.ModelLivros;
import com.example.demo.RepositoryLivros.RepositoryLivros;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiceLivros {
    private final RepositoryLivros repositoryLivros;

    public ServiceLivros(RepositoryLivros repositoryLivros) {
        this.repositoryLivros = repositoryLivros;
    }

    public void criar (ModelLivros modelLivros){
        repositoryLivros.save(modelLivros);
    }

    public List<ModelLivros> listar() {
        return repositoryLivros.findAll();
    }

    public ModelLivros buscarLivro(Long id) {
        return repositoryLivros.findById(id).orElseThrow(() -> new RuntimeException("Livro com ID " + id + " não encontrado"));
    }

    public void remover (Long id){
        if (repositoryLivros.existsById(id)) {
            repositoryLivros.deleteById(id);
        } else {
            throw new RuntimeException("ID" + id + "nao encontrado");
        }
    }
}
