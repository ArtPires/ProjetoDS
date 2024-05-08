// FileManager.java
package br.edu.up.gerenciador.modelos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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

    public void excluirItem(String nomeArquivo, String nomeItem) {
        try {
            File arquivo = new File(nomeArquivo);
            File arquivoTemporario = new File("temp.txt");

            BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoTemporario));

            String linha;
            while ((linha = leitor.readLine()) != null) {
                // Se a linha não contiver o nome do item, escreva-a no arquivo temporário
                if (!linha.contains(nomeItem)) {
                    escritor.write(linha + "\n");
                }
            }

            leitor.close();
            escritor.close();

            // Renomeie o arquivo temporário para substituir o arquivo original
            arquivoTemporario.renameTo(arquivo);
        } catch (IOException e) {
            System.out.println("Erro ao excluir item: " + e.getMessage());
        }
    }

    public void editarArquivoItem(String string, String nomeUsuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editarArquivoItem'");
    }

}
