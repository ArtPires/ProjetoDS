// Treino.java
package br.edu.up.gerenciador.modelos;

import java.util.ArrayList;
import java.util.List;

public class Treino {
    private String tipoDeTreino;
    private String descricao;
    private Integer duracao;
    private ArrayList<String> fichaDeTreino;
    private List<Equipamento> equipamentosNecessarios;

    // --- Construtores da classe Treino ---
    public Treino () { 
        this.fichaDeTreino = new ArrayList<>(); 
        this.equipamentosNecessarios = new ArrayList<>();
    }

    public Treino(String descricao, String tipoDeTreino, Integer duracao) {
        this.descricao = descricao;
        this.tipoDeTreino = tipoDeTreino;
        this.duracao = duracao;
        this.fichaDeTreino = new ArrayList<>();
    }

    // --- Getters e Setters ---
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


    // --- Métodos únicos da classe Treino ---

    public ArrayList<String> gerarFichaDeTreino(Aluno novoAluno) {
        Treino treino = new Treino();
        treino.fichaDeTreino.add("Ficha de treino de: " + novoAluno.getNome());
        treino.fichaDeTreino.add("Tipo de treino: " + novoAluno.getObjetivoTreino());
        
        if (novoAluno.getObjetivoTreino() == "Ganho de Massa"){
            setDuracao(60);
            treino.fichaDeTreino.add("Duração de treino: " + duracao + " minutos");
            treino.fichaDeTreino.add("Exercício 1: Aquecimento");
            treino.fichaDeTreino.add("Exercício 2: Supino");
            treino.fichaDeTreino.add("Exercício 3: Barra Fixa");
            treino.fichaDeTreino.add("Exercício 4: Leg Press");
            treino.fichaDeTreino.add("Exercício 5: Bíceps Alternado");
            treino.fichaDeTreino.add("Exercício 6: Tríceps Press");
        
            treino.fichaDeTreino.add("Equipamentos necessários:");
            int contador = 1;
            for (Equipamento equipamento : equipamentosNecessarios) {
                if(equipamento.getFuncao() == novoAluno.getObjetivoTreino() || equipamento.getFuncao() == "Geral"){
                    treino.fichaDeTreino.add("Equipamento " + contador + ": " + equipamento.getNome());
                    contador++;
                }
            }
        }

        if (novoAluno.getObjetivoTreino() == "Emagrecimento"){
            
            for (Equipamento equipamento : equipamentosNecessarios) {
                fichaDeTreino.add("Equipamento necessário: " + equipamento.getNome());
            }
            fichaDeTreino.add("Exercício 2: ");
            fichaDeTreino.add("Exercício 3: ");
            fichaDeTreino.add("Exercício 4: ");
            fichaDeTreino.add("Exercício 1: ");
            fichaDeTreino.add("Exercício 5: ");
        }

        if (novoAluno.getObjetivoTreino() == "Qualidade de Vida"){
            
            for (Equipamento equipamento : equipamentosNecessarios) {
                fichaDeTreino.add("Equipamento necessário: " + equipamento.getNome());
            }
            fichaDeTreino.add("Exercício 1: ");
            fichaDeTreino.add("Exercício 2: ");
            fichaDeTreino.add("Exercício 3: ");
            fichaDeTreino.add("Exercício 4: ");
            fichaDeTreino.add("Exercício 5: ");
        }

        if (novoAluno.getObjetivoTreino() == "Pré-Adolescentes"){
            
            for (Equipamento equipamento : equipamentosNecessarios) {
                fichaDeTreino.add("Equipamento necessário: " + equipamento.getNome());
            }
            fichaDeTreino.add("Exercício 1: ");
            fichaDeTreino.add("Exercício 2: ");
            fichaDeTreino.add("Exercício 3: ");
            fichaDeTreino.add("Exercício 4: ");
            fichaDeTreino.add("Exercício 5: ");
        }

        return fichaDeTreino;
    }


    public Boolean filtroDeTreino(Aluno novoAluno) {
        // TODO: Lógica para filtrar treino de acordo com objetivo do aluno, disponibilidade de equipamentos, etc.
        System.out.println("Filtrando treino para o aluno " + novoAluno.getNome());

        return true;
    }
}
