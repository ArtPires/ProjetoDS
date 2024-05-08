// Equipamento.java
package br.edu.up.gerenciador.modelos;

public class Equipamento {
    private String nome;
    private String descricao;

    public Equipamento(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString() {
        return "Equipamento {" + 
        "nome='" + this.nome + '\'' +
        " descricao='" + this.descricao +
        '}';
    }
}
