package ServiceProduto;

import ModelProduto.ModelProduto;
import RepositoryProduto.RepositoryProduto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProduto {
    private final RepositoryProduto repositoryProduto;

    public ServiceProduto(RepositoryProduto repositoryProduto){
        this.repositoryProduto = repositoryProduto;
    }

    public void criar (ModelProduto modelProduto){
        repositoryProduto.save(modelProduto);
    }

    public List<ModelProduto> listar(){
        return repositoryProduto.findAll();
    }

    public ModelProduto buscarProduto(Long id){
        return repositoryProduto.findById(id).orElseThrow(()-> new RuntimeException("Produto com ID " + id + "não encontrado"));
    }

    public void remover (Long id){
        if (repositoryProduto.existsById(id)){
            repositoryProduto.deleteById(id);
        } else {
            throw new RuntimeException("ID" + id + "nao encontrado");
        }
    }
}
