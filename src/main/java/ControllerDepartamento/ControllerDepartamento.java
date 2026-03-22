package ControllerDepartamento;

import ModelDepartamento.ModelDepartamento;
import ServiceDepartamento.ServiceDepartamento;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class ControllerDepartamento {
    public final ServiceDepartamento serviceDepartamento;

    public ControllerDepartamento(ServiceDepartamento serviceDepartamento){
        this.serviceDepartamento = serviceDepartamento;
    }

    @GetMapping
    public List<ModelDepartamento> listarTodos(){
        return serviceDepartamento.listar();
    }

    @GetMapping("/{id}")
    public ModelDepartamento buscarPorId(@PathVariable Long id){
        return serviceDepartamento.buscarCat(id);
    }

    @PostMapping
    public void criar(@RequestBody ModelDepartamento modelCat){
        serviceDepartamento.criar(modelCat);
    }

    @DeleteMapping
    public void remover (@PathVariable Long id){
        serviceDepartamento.remover(id);
    }
}
