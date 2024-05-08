// Instrutor.java
package br.edu.up.gerenciador.modelos;

public class Instrutor {
    private String nome;
    private String tipoDeAula;
    private boolean disponibilidade;

    public Instrutor(String nome, String tipoDeAula) {
        this.nome = nome;
        this.tipoDeAula = tipoDeAula;
        this.disponibilidade = true; // Por padrão, o instrutor está disponível
    }

    public void montarTreino(Aluno aluno) {
        System.out.println("Instrutor " + nome + " está montando um treino para o aluno " + aluno.getNome());
        // Lógica para montar o treino
    }

    public void darAula() {
        if (disponibilidade) {
            System.out.println("Instrutor " + nome + " está dando aula de " + tipoDeAula);
        } else {
            System.out.println("Instrutor " + nome + " não está disponível no momento");
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDeAula() {
        return tipoDeAula;
    }

    public void setTipoDeAula(String tipoDeAula) {
        this.tipoDeAula = tipoDeAula;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
