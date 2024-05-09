// Equipamento.java
package br.edu.up.gerenciador.modelos;

import java.util.ArrayList;

public class Equipamento {
    private String nome;
    private String funcao;

    public Equipamento(){}

    public Equipamento(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public ArrayList<Equipamento> criarEquipamentosDeExemplo() {
        ArrayList<Equipamento> equipamentos = new ArrayList<>();

        // Equipamentos de peito
        equipamentos.add(new Equipamento("Banco de Supino", "Ganho de Massa"));
        equipamentos.add(new Equipamento("Crucifixo", "Qualidade de Vida"));
        equipamentos.add(new Equipamento("Chest Press", "Emagrecimento"));

        // Equipamentos de costas
        equipamentos.add(new Equipamento("Barra Fixa", "Ganho de Massa"));
        equipamentos.add(new Equipamento("Remada Máquina", "Emagrecimento"));
        equipamentos.add(new Equipamento("Puxada Alta", "Qualidade de Vida"));
        
        // Equipamentos de inferiores
        equipamentos.add(new Equipamento("Leg Press", "Ganho de Massa"));
        equipamentos.add(new Equipamento("Cadeira Flexora", "Emagrecimento"));
        equipamentos.add(new Equipamento("Cadeira Extensora", "Qualidade de Vida"));
        
        // Equipamentos de ombros
        equipamentos.add(new Equipamento("Shoulder Press", "Emagrecimento"));
        equipamentos.add(new Equipamento("Cross Over Paralelo", "Qualidade de Vida"));

        // Equipamentos de braços
        equipamentos.add(new Equipamento("Bíceps Alternado", "Ganho de Massa"));
        equipamentos.add(new Equipamento("Tríceps Press", "Ganho de Massa"));

        //Equipamentos de cardio
        equipamentos.add(new Equipamento("Esteira", "Ganho de Massa"));
        equipamentos.add(new Equipamento("Bicicleta Ergométrica", "Emagrecimento"));
        equipamentos.add(new Equipamento("Elíptico", "Qualidade de Vida"));
        equipamentos.add(new Equipamento("Escada", "Pré-Adolescentes"));

        // Pesos livres
        equipamentos.add(new Equipamento("Pesos Livres", "Geral"));

        return equipamentos;
    }
}
