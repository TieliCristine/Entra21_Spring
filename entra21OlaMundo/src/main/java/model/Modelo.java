package model;

public class Modelo {

    private Long id;
    private String nome;
    private String cor;
    private int ano;
    private int quantPorta;

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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQuantPorta() {
        return quantPorta;
    }

    public void setQuantPorta(int quantPorta) {
        this.quantPorta = quantPorta;
    }
}
