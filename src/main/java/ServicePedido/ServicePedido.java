package ServicePedido;

import ModelPedido.ModelPedido;
import RepositoryPedido.RepositoryPedido;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class ServicePedido {
    private final ServicePedido servicePedido;

    public ServicePedido(RepositoryPedido repositoryPedido) {
        this.Repository = repositoryPedido;
    }

    public void criar (ModelPedido modelLivros){
        RepositoryPedido.save(modelLivros);
    }

    public List<ModelPedido> listar() {
        return RepositoryPedido.findAll();
    }

    public ModelPedido buscarLivro(Long id) {
        return RepositoryPedido.findById(id).orElseThrow(() -> new RuntimeException("Pedido com ID " + id + " não encontrado"));
    }

    public void remover (Long id){
        if (RepositoryPedido.existsById(id)) {
            RepositoryPedido.deleteById(id);
        } else {
            throw new RuntimeException("ID" + id + "nao encontrado");
        }
    }
}
}
