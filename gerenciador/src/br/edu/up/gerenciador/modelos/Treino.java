package br.edu.up.gerenciador.modelos;

import java.util.ArrayList;
import java.util.List;

public class Treino {
//<<<<<<< integracao-de-equipamento-com-treino
    private String tipoDeTreino;
    private String descricao;
    private Integer duracao;
//=======
    private Aluno aluno;
    private Instrutor instrutor;
//>>>>>>> develop
    private ArrayList<String> fichaDeTreino;
    private List<Equipamento> equipamentosNecessarios;

    // --- Construtores da classe Treino ---
    public Treino () { 
        this.fichaDeTreino = new ArrayList<>(); 
        this.equipamentosNecessarios = new ArrayList<>();
    }

//<<<<<<< integracao-de-equipamento-com-treino
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
//=======
    public Treino(Aluno aluno, Instrutor instrutor, String descricao) {
        this.aluno = aluno;
        this.instrutor = instrutor;
        this.fichaDeTreino = new ArrayList<>();
    }

    public void gerarFichaDeTreino() {
        fichaDeTreino.clear(); // Limpa a ficha de treino anterior, se houver
        
        if (aluno.getIdade() >= 12 && aluno.getIdade() <= 15) {
            fichaDeTreino.add("Ficha de Treino para Pré-Adolescentes:");
            // Lógica para gerar a ficha de treino para pré-adolescentes...
        } else if (aluno.getIdade() >= 16 && aluno.getIdade() <= 55) {
            double imc = calcularIMC(aluno.getPeso(), aluno.getAltura());
            if (imc < 16) {
                fichaDeTreino.add("Ficha de Treino para Magreza Grave:");
                // Lógica para gerar a ficha de treino para magreza grave...
            } else if (imc >= 16 && imc <= 16.9 || imc >= 17 && imc <= 18.5) {
                fichaDeTreino.add("Ficha de Treino para Ganho de Massa Muscular:");
                // Lógica para gerar a ficha de treino para ganho de massa muscular...
            } else if (imc >= 25 && imc <= 29.9) {
                fichaDeTreino.add("Ficha de Treino para Sobrepeso:");
                // Lógica para gerar a ficha de treino para sobrepeso...
            } else if (imc >= 30 && imc <= 34.9) {
                fichaDeTreino.add("Ficha de Treino para Obesidade Grau I:");
                // Lógica para gerar a ficha de treino para obesidade grau I...
            } else if (imc >= 35 && imc <= 39.9) {
                fichaDeTreino.add("Ficha de Treino para Obesidade Grau II ou Severa:");
                // Lógica para gerar a ficha de treino para obesidade grau II ou severa...
            } else {
                fichaDeTreino.add("Ficha de Treino para Obesidade Grau III ou Mórbida:");
                // Lógica para gerar a ficha de treino para obesidade grau III ou mórbida...
            }
        } else if (aluno.getIdade() > 55) {
            fichaDeTreino.add("Ficha de Treino para Qualidade de Vida:");
            // Lógica para gerar a ficha de treino para qualidade de vida...
        }
    }

    // public void enviarFichaDeTreino() {
    //     aluno.receberFichaDeTreino(fichaDeTreino);
    // }

    private double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
//>>>>>>> develop
    }
}
