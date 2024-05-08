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
        this.equipamentosNecessarios = new ArrayList<>();
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
            setDuracao(45);
            treino.fichaDeTreino.add("Duração de treino: " + duracao + " minutos");
            fichaDeTreino.add("Exercício 1: Chest Press");
            fichaDeTreino.add("Exercício 2: Remada Máquina");
            fichaDeTreino.add("Exercício 3: Cadeira Flexora");
            fichaDeTreino.add("Exercício 4: Shoulder Press");
            fichaDeTreino.add("Exercício 5: Cardio");
            
            treino.fichaDeTreino.add("Equipamentos necessários:");
            int contador = 1;
            for (Equipamento equipamento : equipamentosNecessarios) {
                if(equipamento.getFuncao() == novoAluno.getObjetivoTreino() || equipamento.getFuncao() == "Geral"){
                    treino.fichaDeTreino.add("Equipamento " + contador + ": " + equipamento.getNome());
                    contador++;
                }
            }
        }

        if (novoAluno.getObjetivoTreino() == "Qualidade de Vida"){
            setDuracao(30);
            treino.fichaDeTreino.add("Duração de treino: " + duracao + " minutos");
            fichaDeTreino.add("Exercício 1: Aquecimento");
            fichaDeTreino.add("Exercício 2: Crucifixo");
            fichaDeTreino.add("Exercício 3: Puxada Alta");
            fichaDeTreino.add("Exercício 4: Cadeira Extensora");
            fichaDeTreino.add("Exercício 5: Cross Over Paralelo");

            treino.fichaDeTreino.add("Equipamentos necessários:");
            int contador = 1;
            for (Equipamento equipamento : equipamentosNecessarios) {
                if(equipamento.getFuncao() == novoAluno.getObjetivoTreino() || equipamento.getFuncao() == "Geral"){
                    treino.fichaDeTreino.add("Equipamento " + contador + ": " + equipamento.getNome());
                    contador++;
                }
            }
        }

        if (novoAluno.getObjetivoTreino() == "Pré-Adolescentes"){
            setDuracao(45);
            treino.fichaDeTreino.add("Duração de treino: " + duracao + " minutos");
            fichaDeTreino.add("Exercício 1: Aquecimeto");
            fichaDeTreino.add("Exercício 2: Rosca direta");
            fichaDeTreino.add("Exercício 3: Agachamento");
            fichaDeTreino.add("Exercício 4: Abdominal");
            fichaDeTreino.add("Exercício 5: Cardio");
            
            treino.fichaDeTreino.add("Equipamentos necessários:");
            int contador = 1;
            for (Equipamento equipamento : equipamentosNecessarios) {
                if(equipamento.getFuncao() == novoAluno.getObjetivoTreino() || equipamento.getFuncao() == "Geral"){
                    treino.fichaDeTreino.add("Equipamento " + contador + ": " + equipamento.getNome());
                    contador++;
                }
            }
        }

        return fichaDeTreino;
    }

    public Boolean filtroDeTreino(Aluno novoAluno) {
        System.out.println("Filtrando treino para o aluno " + novoAluno.getNome());
        
        if (novoAluno.getIdade() >= 12 && novoAluno.getIdade() <= 15 && novoAluno.getObjetivoTreino() == "Pré-Adolescentes") {
            // Pré-adolescentes
            return true;
        } 
        if (novoAluno.getIdade() >= 16 && novoAluno.getIdade() <= 55) {
            double imc = calcularIMC(novoAluno.getPeso(), novoAluno.getAltura());
            if (imc < 16) {
                // Tratamento de erro para magreza extrema
                return false;
            } 
            
            if (imc >= 16 && imc <= 16.9 || imc >= 17 && imc <= 18.5) {
                if (novoAluno.getObjetivoTreino() == "Ganhar Massa") {
                    return true;
                } else {
                    return false;
                }
            }
            
            if (imc >= 25) {
                if (novoAluno.getObjetivoTreino() == "Emagrecimento"){
                    return true;
                } else {
                    return false;
                }
            }
        }
        if (novoAluno.getIdade() > 55) {
            if (novoAluno.getObjetivoTreino() == "Qualidade de Vida"){
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

    private double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);

    }
}
