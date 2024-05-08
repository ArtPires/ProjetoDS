// FileManager.java
package br.edu.up.gerenciador.modelos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    // Método para escrever em um arquivo
    public void escreverArquivo(String nomeArquivo, String conteudo) {
        try {
            FileWriter escritor = new FileWriter(nomeArquivo);
            escritor.write(conteudo);
            escritor.close();
            System.out.println("Arquivo " + nomeArquivo + " salvo com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao salvar o arquivo " + nomeArquivo);
        }
    }

    // Método para ler um arquivo
    public String lerArquivo(String nomeArquivo) {
        StringBuilder conteudo = new StringBuilder();
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            while ((linha = leitor.readLine()) != null) {
                conteudo.append(linha).append("\n");
            }
            leitor.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao ler o arquivo " + nomeArquivo);
        }
        return conteudo.toString();
    }

    // Método para procurar por uma string em um arquivo
    public boolean procurarNoArquivo(String nomeArquivo, String textoProcurado) {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            while ((linha = leitor.readLine()) != null) {
                if (linha.contains(textoProcurado)) {
                    leitor.close();
                    return true;
                }
            }
            leitor.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao procurar no arquivo " + nomeArquivo);
        }
        return false;
    }

    // Método para editar um arquivo
    public void editarArquivo(String nomeArquivo, String textoAntigo, String textoNovo) {
        try {
            BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
            StringBuilder conteudo = new StringBuilder();
            String linha;
            while ((linha = leitor.readLine()) != null) {
                conteudo.append(linha.replaceAll(textoAntigo, textoNovo)).append("\n");
            }
            leitor.close();
            FileWriter escritor = new FileWriter(nomeArquivo);
            escritor.write(conteudo.toString());
            escritor.close();
            System.out.println("Arquivo " + nomeArquivo + " editado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao editar o arquivo " + nomeArquivo);
        }
    }
}
