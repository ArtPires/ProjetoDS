package br.edu.up.gerenciador.modelos;

import java.sql.Time;

public class Treino {
    
    public String tipoDeTreino;
    public Time duracao;
    public Integer numeroDeSeries;

    public Treino(){ }

    public Treino(String tipoDeTreino) {
        this.tipoDeTreino = tipoDeTreino;
        this.duracao = new Time(0);
    }

    public Treino(String tipoDeTreino, Time duracao) {
        this.tipoDeTreino = tipoDeTreino;
        this.duracao = duracao;
    }

    
    public String getTipoDeTreino() {
        return tipoDeTreino;
    }

    public void setTipoDeTreino(String tipoDeTreino) {
        this.tipoDeTreino = tipoDeTreino;
    }

    public Time getDuracao() {
        return duracao;
    }

    public void setDuracao(Time duracao) {
        this.duracao = duracao;
    }


    public Boolean filtroDeTreino(Aluno aluno){
        if (aluno.getObjetivoDeTreino() != "Infantil" && aluno.getIdade() >= 12 && aluno.getIdade() < 16){
            System.out.println("Não foi possivel criar um treino do tipo: " + getTipoDeTreino() + 
                                " pois o aluno " + aluno.getNome() + " não tem idade suficiente para esse treino!");
            return false;
        }

        if (aluno.getObjetivoDeTreino() == "" && aluno.getPeso() >= 110 && aluno.getIMC() == 110) {
            
            return false;
        }


        return true;
    }

    // Método que cria uma ficha de treino para cada tipo de treino padrão, se o tipo de treino informado é
    // diferente solicita ao usuário que informe todos os dados necessários para a criação da ficha de treino
    public void criarFichaDeTreino(String tipoDeTreino){

        switch (tipoDeTreino) {
            case "Musculação":
                
                break;

            case "Emagrecimento":
                
                break;
            
            case "Qualidade de Vida":
                
                break;
        
            default:
                break;
        }

    }

    // Método que cria 4 treinos previamente montados para facilitar a utilização do programa
    public static void inicializarTreinos(){

        Treino musculacao = new Treino("Musculação"); 
        Treino emagrecimento = new Treino("Emagrecimento"); 
        Treino qualidadeDeVida = new Treino("Qualidade de Vida");
        Treino infantil = new Treino("Infantil");

        musculacao.criarFichaDeTreino(musculacao.getTipoDeTreino());
        emagrecimento.criarFichaDeTreino(emagrecimento.getTipoDeTreino());
        qualidadeDeVida.criarFichaDeTreino(qualidadeDeVida.getTipoDeTreino());
        infantil.criarFichaDeTreino(infantil.getTipoDeTreino());

    }

}
