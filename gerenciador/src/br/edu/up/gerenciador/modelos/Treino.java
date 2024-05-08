// Treino.java
package br.edu.up.gerenciador.modelos;

import java.util.ArrayList;

public class Treino {
    private Aluno aluno;
    private Instrutor instrutor;
    private String descricao;
    private String tipoDeTreino;
    private int duracao;
    private ArrayList<String> fichaDeTreino;

    public Treino(Aluno aluno, Instrutor instrutor, String descricao, String tipoDeTreino, int duracao) {
        this.aluno = aluno;
        this.instrutor = instrutor;
        this.descricao = descricao;
        this.tipoDeTreino = tipoDeTreino;
        this.duracao = duracao;
        this.fichaDeTreino = new ArrayList<>();
    }

    public void gerarFichaDeTreino() {
        // Lógica para gerar a ficha de treino com base no tipo de treino e duração
        fichaDeTreino.clear(); 
        fichaDeTreino.add("Tipo de treino: " + tipoDeTreino);
        fichaDeTreino.add("Duração de treino: " + duracao + " minutos");
        fichaDeTreino.add("Exercício 1: ");
        fichaDeTreino.add("Exercício 2: ");
        fichaDeTreino.add("Exercício 3: ");
    }

    public void enviarFichaDeTreino() {
        aluno.receberFichaDeTreino(fichaDeTreino);
    }

    public void filtroDeTreino() {
        // Lógica para filtrar treino de acordo com objetivo do aluno, disponibilidade de equipamentos, etc.
        System.out.println("Filtrando treino para o aluno " + aluno.getNome());
    }

    // Getters e Setters
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoDeTreino() {
        return tipoDeTreino;
    }

    public void setTipoDeTreino(String tipoDeTreino) {
        this.tipoDeTreino = tipoDeTreino;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
