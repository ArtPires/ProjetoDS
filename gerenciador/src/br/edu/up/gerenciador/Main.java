// Main.java
package br.edu.up.gerenciador;

import br.edu.up.gerenciador.modelos.Aluno;
import br.edu.up.gerenciador.modelos.FileManager;
import br.edu.up.gerenciador.modelos.Instrutor;
import br.edu.up.gerenciador.modelos.Treino;

public class Main {
    public static void main(String[] args) {
        // Criando um aluno
        Aluno aluno = new Aluno("João", "12345", 1.75, 80.0, 25);
        aluno.definirObjetivo("Ganhar massa muscular");

        // Criando um instrutor
        Instrutor instrutor = new Instrutor("Maria", "Musculação");
        instrutor.setDisponibilidade(true); // Definindo o instrutor como disponível

        // Criando um treino
        Treino treino = new Treino(aluno, instrutor, "Treino de pernas", "Musculação", 60);
        treino.filtroDeTreino(); // Aplicando filtro de treino
        treino.gerarFichaDeTreino(); // Gerando a ficha de treino
        treino.enviarFichaDeTreino(); // Enviando a ficha de treino para o aluno

        // Salvando os dados do aluno em um arquivo
        FileManager fileManager = new FileManager();
        String dadosAluno = "Nome: " + aluno.getNome() + "\nMatrícula: " + aluno.getMatricula() + "\nAltura: " + aluno.getAltura() +
                "\nPeso: " + aluno.getPeso() + "\nIdade: " + aluno.getIdade() + "\nObjetivo de Treino: " + aluno.getObjetivoTreino();
        fileManager.escreverArquivo("dados_aluno.txt", dadosAluno);

        // Lendo os dados do aluno do arquivo
        String dadosLidos = fileManager.lerArquivo("dados_aluno.txt");
        System.out.println("Dados do aluno lidos do arquivo:\n" + dadosLidos);

        // Procurando por uma palavra específica no arquivo
        String palavraProcurada = "Altura";
        boolean encontrado = fileManager.procurarNoArquivo("dados_aluno.txt", palavraProcurada);
        if (encontrado) {
            System.out.println("Palavra '" + palavraProcurada + "' encontrada no arquivo.");
        } else {
            System.out.println("Palavra '" + palavraProcurada + "' não encontrada no arquivo.");
        }

        // Editando o arquivo
        fileManager.editarArquivo("dados_aluno.txt", "Ganhar massa muscular", "Perder peso");
        dadosLidos = fileManager.lerArquivo("dados_aluno.txt");
        System.out.println("\nDados do aluno após edição do arquivo:\n" + dadosLidos);
    }
}
