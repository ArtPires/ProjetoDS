package br.edu.up.gerenciador.modelos;

import java.util.ArrayList;

public class Treino {
    private Aluno aluno;
    private Instrutor instrutor;
    private ArrayList<String> fichaDeTreino;

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
    }
}
