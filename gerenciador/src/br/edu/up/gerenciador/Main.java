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

       InterfaceGerenciador interfaceGerenciador = new InterfaceGerenciador();
       interfaceGerenciador.exibirMenu();
    }
}
