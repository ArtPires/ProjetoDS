package br.edu.up.gerenciador.modelos;

import java.sql.Time;

public class Treino {
    
    public String tipoDeTreino;
    public Time duracao;
    public String objetivo;

    public Treino(String tipoDeTreino, String objetivo) {
        this.tipoDeTreino = tipoDeTreino;
        this.objetivo = objetivo;
        this.duracao = new Time(0);
    }

    public Treino(String tipoDeTreino, Time duracao, String objetivo) {
        this.tipoDeTreino = tipoDeTreino;
        this.duracao = duracao;
        this.objetivo = objetivo;
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

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }


    public Boolean filtroDeTreino(Aluno aluno){
        if (getTipoDeTreino() == "" && aluno.getIdade() >= 60){

            return false;
        }

        if (tipoDeTreino == "" && aluno.getPeso() >= 110 && aluno.getIMC() == 110) {
            
            return false;
        }





        return true;
    }

    public void criarFichaDeTreino(){

    }

}
