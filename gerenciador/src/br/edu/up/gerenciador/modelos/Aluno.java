// Aluno.java
package br.edu.up.gerenciador.modelos;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String matricula;
    private double altura;
    private double peso;
    private int idade;
    private double imc;
    private String objetivoTreino;
    private ArrayList<String> fichaDeTreinoRecebida;

    public Aluno(String nome, String matricula, double altura, double peso, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
        this.fichaDeTreinoRecebida = new ArrayList<>();
    }

    public void receberFichaDeTreino(ArrayList<String> fichaDeTreino) {
        this.fichaDeTreinoRecebida = fichaDeTreino;
        System.out.println("Ficha de treino recebida para " + nome + ": ");
        for (String exercicio : fichaDeTreino) {
            System.out.println(exercicio);
        }
    }

    public void definirObjetivo(String objetivo) {
        this.objetivoTreino = objetivo;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getObjetivoTreino() {
        return objetivoTreino;
    }

    public void setObjetivoTreino(String objetivoTreino) {
        this.objetivoTreino = objetivoTreino;
    }

}
