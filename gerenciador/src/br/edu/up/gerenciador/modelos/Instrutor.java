// Instrutor.java
package br.edu.up.gerenciador.modelos;

import java.util.ArrayList;

public class Instrutor {
    private String nome;
    private String tipoDeAula;
    private boolean disponibilidade;
    private ArrayList<Instrutor> listaInstrutores;

    // --- Construtores da classe Instrutor ---

    public Instrutor () { }

    public Instrutor(String nome, String tipoDeAula) {
        this.nome = nome;
        this.tipoDeAula = tipoDeAula;
        this.disponibilidade = true; // Por padrão, o instrutor está disponível
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

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public ArrayList<Instrutor> getListaInstrutores() {
        return listaInstrutores;
    }

    public void setListaInstrutores(ArrayList<Instrutor> listaInstrutores) {
        this.listaInstrutores = listaInstrutores;
    }


    // --- Métodos únicos da classe Instrutor ---

    public static Boolean montarTreino(Aluno novoAluno, Instrutor instrutor) {
        if (instrutor.instrutorDisponivel() == ""){
            System.out.println("Não foi possivel montar o treino, nenhum instrutor está disponivel no momento");
            return false;
        }

        Treino treino = new Treino();
        if (!treino.filtroDeTreino(novoAluno)) {
            System.out.println("Não foi possivel montar o treino do tipo: " + novoAluno.getObjetivoTreino() 
            + " para o aluno: " + novoAluno.getNome() + ". Impedido pelo filtro!");
            return false;
        }

        novoAluno.receberFichaDeTreino(treino.gerarFichaDeTreino(novoAluno));

        return true;
    }

    public String instrutorDisponivel(){
        for(Instrutor instrutor: listaInstrutores){
            if(instrutor.getDisponibilidade()){
                return instrutor.getNome();
            }
        }
        return "";
    }

    public void darAula() {
        if (disponibilidade) {
            System.out.println("Instrutor " + nome + " está dando aula de " + tipoDeAula);
        } else {
            System.out.println("Instrutor " + nome + " não está disponível no momento");
        }
    }
}
