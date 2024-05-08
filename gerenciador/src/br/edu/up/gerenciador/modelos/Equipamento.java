package br.edu.up.gerenciador.modelos;

public class Equipamento {
    
    private String funcao;
    private Double capacidade;
    private String localizacao;
    private Boolean disponivel;

    public Equipamento(String funcao, Double capacidade, String localizacao) {
        this.funcao = funcao;
        this.capacidade = capacidade;
        this.localizacao = localizacao;
        this.disponivel = true;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Double capacidade) {
        this.capacidade = capacidade;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Equipamento {" + 
        "funcao='" + this.funcao + '\'' +
        " capacidade='" + this.capacidade + '\'' +
        " localizacao='" + this.localizacao + 
        '}';
    }
}
