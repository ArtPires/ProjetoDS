package br.edu.up.gerenciador.modelos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManeger {
    
    private String caminhoCompleto;

    public void escreverArquivo(String nomeArquivo, String conteudo, Boolean adicionar) {
        caminhoCompleto = "gerenciador/src/br/edu/up/gerenciador/arquivos/" + nomeArquivo;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoCompleto, adicionar))) {
            writer.write(conteudo);
            writer.newLine();
            System.out.println("Conteúdo escrito com sucesso em " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo " + nomeArquivo + ": " + e.getMessage());
        }
    }

    public String lerArquivo(String nomeArquivo) {
        caminhoCompleto = "gerenciador/src/br/edu/up/gerenciador/arquivos/" + nomeArquivo;
        StringBuilder conteudo = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoCompleto))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                conteudo.append(linha).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo " + nomeArquivo + ": " + e.getMessage());
        }
        return conteudo.toString();
    }
}

