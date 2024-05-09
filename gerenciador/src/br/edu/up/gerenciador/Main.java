// Main.java
package br.edu.up.gerenciador;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.up.gerenciador.modelos.Aluno;
import br.edu.up.gerenciador.modelos.InterfaceAluno;
import br.edu.up.gerenciador.modelos.InterfaceGerenciador;
import br.edu.up.gerenciador.modelos.InterfaceInstrutor;

public class Main {
    public static void main(String[] args) {

        InterfaceInstrutor minhaInterface = new InterfaceInstrutor(1);
        InterfaceAluno interfaceAlnos = new InterfaceAluno();

        ArrayList<Aluno> listaAlunos = interfaceAlnos.getListaAlunos();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        String nome = scanner.nextLine();

        Aluno novoAluno = new Aluno(nome, 1.57f, 62.0f, 20);
        novoAluno.setObjetivoTreino("Emagrecimento");        
        interfaceAlnos.pedirFichaDeTreino(novoAluno);

        // InterfaceGerenciador interfaceGerenciador = new InterfaceGerenciador();
        // interfaceGerenciador.exibirMenu();
    }
}
