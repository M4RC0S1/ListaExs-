package ServiceFornecedor;

import ModelFornecedor.ModelFornecedor;
import RepositoryFornecedor.RepositoryFornecedor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceFornecedor {
    private final RepositoryFornecedor repositoryFornecedor;

    public ServiceFornecedor(RepositoryFornecedor repositoryFornecedor){
        this.repositoryFornecedor = repositoryFornecedor;
    }

    public void criar(ModelFornecedor modelFornecedor){
        repositoryFornecedor.save(modelFornecedor);
    }

    public List<ModelFornecedor> listar(){
        return repositoryFornecedor.findAll();
    }

    public ModelFornecedor buscarFornecedor(Long id){
        return repositoryFornecedor.findById(id).orElseThrow(()-> new RuntimeException("Fornecedor com ID " + id + "não encontrado"));
    }

    public void remover(Long id){
        if (repositoryFornecedor.existsById(id)){
            repositoryFornecedor.deleteById(id);
        } else {
            throw new RuntimeException("ID" + id + "nao encontrado");
        }
    }
}
