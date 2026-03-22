package com.example.demo.ModelFornecedor;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_fornecedor")
public class ModelFornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "nome_fantasia_fornecedor")
    private String nomeFantasia;
    @Column(name = "cnpj_fornecedor")
    private String cnpj;
    private String contato;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
