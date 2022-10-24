package model;

import java.io.Serializable;

public class Fabricante implements Serializable {

    private static long serialVersionUID = 1L;

    public Long id;
    public String nome;
    public String origem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
}
