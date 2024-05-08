// Aluno.java
package br.edu.up.gerenciador.modelos;

import java.util.ArrayList;
import java.util.Random;

public class Aluno {
    private String nome;
    private Integer matricula;
    private Float altura;
    private Float peso;
    private int idade;
    private Float imc;
    private String objetivoTreino;
    private Random random = new Random();
    private ArrayList<String> fichaDeTreinoRecebida;
    private ArrayList<Aluno> listaAlunos;

    public Aluno(String nome, Float altura, Float peso, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;

        this.matricula = random.nextInt(10000);

        // Chame o método para salvar os dados em arquivo
        FileManager.salvarAlunosEmArquivo(this);
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

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
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

    public void setImc(Float imc) {
        this.imc = imc;
    }

    public String getObjetivoTreino() {
        return objetivoTreino;
    }

    public void setObjetivoTreino(String objetivoTreino) {
        this.objetivoTreino = objetivoTreino;
    }
  
    // --- Métodos únicos da classe Aluno ---
    
    public Boolean solicitarFichaDeTreino(Instrutor instrutor){
        if(!Instrutor.montarTreino(this, instrutor)){
            // TODO: solicitar ao usuário para definir outro tipo de treino
            return false;
        }
        return true;
    }
    
    public void receberFichaDeTreino(ArrayList<String> fichaDeTreino) {
        this.fichaDeTreinoRecebida = fichaDeTreino;
    }
}
