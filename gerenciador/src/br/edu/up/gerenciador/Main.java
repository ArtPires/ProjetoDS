package br.edu.up.gerenciador;

import br.edu.up.gerenciador.modelos.Aluno;
import br.edu.up.gerenciador.modelos.FileManeger;

public class Main {
    public static void main(String[] args) {
    
        FileManeger fileManeger = new FileManeger();
        Aluno aluno = new Aluno("Artur", 123456, 1.75, 60.0, 20, "Ganhar massa");

        fileManeger.escreverArquivo("teste.txt", aluno.toString(), false);
        fileManeger.escreverArquivo("teste.txt", aluno.toString(), true);

        System.out.println(fileManeger.lerArquivo("teste.txt"));
    }
}
