// Aluno.java
package br.edu.up.gerenciador.modelos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Aluno {

    private static int proximoNumeroMatricula = 10000;
    private String nome;
    private String matricula; // Descomente esta linha
    private Float altura;
    private Float peso;
    private int idade;
    private Float imc;
    private String objetivoTreino;
    private ArrayList<String> fichaDeTreinoRecebida;
    private ArrayList<Aluno> listaAlunos;

    public Aluno(String nome, Float altura, Float peso, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;

        // Atribuição da matrícula deve ser feita apenas no construtor
        this.matricula = Integer.toString(proximoNumeroMatricula);

        // Incremento da matrícula para o próximo aluno
        proximoNumeroMatricula += 15;

        // Chame o método para salvar os dados em arquivo
        salvarDadosEmArquivo();
    }
    // public void receberFichaDeTreino(ArrayList<String> fichaDeTreino) {
    //     this.fichaDeTreinoRecebida = fichaDeTreino;
    //     System.out.println("Ficha de treino recebida para " + nome + ": ");
    //     for (String exercicio : fichaDeTreino) {
    //         System.out.println(exercicio);
    //     }
    // }

    // 

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
        System.out.println("Ficha de treino recebida para " + nome + ": ");
        for (String exercicio : fichaDeTreino) {
            System.out.println(exercicio);
        }

    }
     @SuppressWarnings("static-access")
    public void salvarDadosEmArquivo() {
        try {
            FileWriter writer = new FileWriter("alunos_cadastrados.txt", true);
            writer.write("Nome: " + this.nome + "\n");
            writer.write("Matrícula: " + this.proximoNumeroMatricula + "\n");
            writer.write("Altura: " + this.altura + "\n");
            writer.write("Peso: " + this.peso + "\n");
            writer.write("Idade: " + this.idade + "\n\n");
            writer.close();
            System.out.println("Dados do aluno salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar dados!  " + e.getMessage());
        }
    }
}
