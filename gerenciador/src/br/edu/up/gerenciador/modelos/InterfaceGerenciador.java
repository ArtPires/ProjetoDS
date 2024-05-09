package br.edu.up.gerenciador.modelos;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfaceGerenciador {
    
    private Scanner scanner;
    private FileManager fileManager;
    private Treino treino;
    private ArrayList<String> fichasDeTreino;
    private ArrayList<Instrutor> instrutores;
    private ArrayList<Aluno> alunos;
   

    public InterfaceGerenciador() {
        scanner = new Scanner(System.in);
        fileManager = new FileManager();
        fichasDeTreino = new ArrayList<>();
        instrutores = new ArrayList<>();
        alunos = new ArrayList<>();

    }

    public void editarInstrutor(String nomeInstrutor) {
        System.out.println("Editar Instrutor:");
            Instrutor instrutor = encontrarInstrutorPorNome(nomeInstrutor);
        if (instrutor != null) {
            // Edite os dados do instrutor conforme necessário
            instrutor.setNome("Novo nome");
            instrutor.setTipoDeAula("Novo tipo de aula");
            // Salve os dados atualizados
            salvarDadosInstrutores(instrutores);
            System.out.println("Dados do instrutor editados com sucesso!");
        } else {
            System.out.println("Instrutor não encontrado!");
        }
    }

    public void excluirInstrutor(String nomeInstrutor) {
        System.out.println("Excluir Instrutor:");
            Instrutor instrutor = encontrarInstrutorPorNome(nomeInstrutor);
        if (instrutor != null) {
            instrutores.remove(instrutor);
            // Salve os dados atualizados
            salvarDadosInstrutores(instrutores);
            System.out.println("Instrutor excluído com sucesso!");
        } else {
            System.out.println("Instrutor não encontrado!");
        }
    }


    private Instrutor encontrarInstrutorPorNome(String nomeInstrutor) {
        throw new UnsupportedOperationException("Unimplemented method 'encontrarInstrutorPorNome'");
    }

    public void exibirMenu() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("                                                                 Bem-vindo ao Gerenciador de Academia!                                                \n ");
            System.out.println("Selecione uma opção:");
            System.out.println("1. Acesso Administrador");
            System.out.println("2. Acesso Aluno");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    acessarComoAdministrador();
                    break;
                case 2:
                    acessarComoAluno();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione uma das opções disponiveis.");
            }
        }
    }

    private void acessarComoAdministrador() {
        System.out.println("                                                                Você está acessando como Administrador                                          \n");
        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();
        if (verificarSenha(senha)) {
            menuAdministrador();
        } else {
            System.out.println("                                                                    Senha incorreta. Acesso negado!!                                             \n");
        }
    } 

    private void acessarComoAluno() {
        System.out.println("                                                                    Você está acessando como Aluno                                                \n");
        System.out.println("Por favor, preencha seus dados: ");

        System.out.println("Digite o seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite a sua altura: ");
        Float altura = scanner.nextFloat();
        System.out.println("Digite o seu peso: ");
        Float peso = scanner.nextFloat();
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        Aluno aluno = new Aluno(nome, altura, peso, idade);
        alunos.add(aluno);

        Instrutor instrutor = new Instrutor("Juarez", "Musculação");

        solicitarFichaDeTreino(aluno, instrutor);
    }        

    private void solicitarFichaDeTreino(Aluno aluno, Instrutor instrutor) {
        System.out.println("Deseja solicitar uma ficha de treino para um instrutor? (S/N)");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("S")) {
            aluno.solicitarFichaDeTreino(instrutor);
        }

    }    


    private boolean verificarSenha(String senha) {
        return senha.equals("12345");
    }

    private void menuAdministrador() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("1. Criar Instrutor");
            System.out.println("2. Alterar Cadastro Instrutor");
            System.out.println("3. Excluir Instrutor");
            System.out.println("4. Alterar Cadastro Usuário");
            System.out.println("5. Excluir Usuário");
            System.out.println("6. Salvar dados em arquivo");
            System.out.println("7. Voltar ao menu principal");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    criarInstrutor();
                    break;
                case 2:
                    editarInstrutor();
                    break;
                case 3:  
                    excluirInstrutor();
                    break;

                case 4: 
                    editarUsuario();
                    break;

                case 5: 
                    excluirUsuario();
                    break;
                    
                case 6: 
                     salvarDadosInstrutores(instrutores);
                     break;
                case 7:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma das opções fornecidas.");
            }
        }
    }

    private void criarInstrutor() {
        System.out.println("Digite o nome do instrutor:");
        String nomeInstrutor = scanner.nextLine();
        System.out.println("Digite o tipo de aula do instrutor:");
        String tipoDeAula = scanner.nextLine();
        Instrutor instrutor = new Instrutor(nomeInstrutor, tipoDeAula);
        instrutores.add(instrutor);
        System.out.println("                                                                      Instrutor criado com sucesso!                          \n");
    
    }

    
    private void salvarDadosInstrutores(ArrayList<Instrutor> instrutores2) {
    StringBuilder conteudoArquivo = new StringBuilder();
    conteudoArquivo.append("Lista de Instrutores:\n\n");
    for (Instrutor instrutor : instrutores) {
    conteudoArquivo.append("Nome: ").append(instrutor.getNome()).append("\n");
    conteudoArquivo.append("Tipo de Aula: ").append(instrutor.getTipoDeAula()).append("\n\n");
    }

        String nomeArquivo = "instrutores.txt";

        fileManager.escreverArquivo(nomeArquivo, conteudoArquivo.toString());
        System.out.println("Dados dos instrutores salvos em arquivo '" + nomeArquivo + "' com sucesso! \n");
    }
  
    public void editarInstrutor() {
        System.out.println("Editar Instrutor:");
        System.out.println("Digite o nome do instrutor que deseja editar:");
        String nomeInstrutor = scanner.nextLine();
        fileManager.editarArquivoItem("instrutores.txt", nomeInstrutor, nomeInstrutor);
        System.out.println("Dados do instrutor editados com sucesso!");
        
    }
    public void excluirInstrutor() {
        System.out.println("Excluir Instrutor:");
        System.out.println("Digite o nome do instrutor que deseja excluir:");
        String nomeInstrutor = scanner.nextLine();
        fileManager.excluirItem("instrutores.txt", nomeInstrutor);
        System.out.println("Instrutor excluído com sucesso!");
    }
    
    private void editarUsuario() {
        System.out.println("Editar Usuário:");
        System.out.println("Digite o nome do usuário que deseja editar:");
        String nomeUsuario = scanner.nextLine();
        fileManager.editarArquivoItem("alunos_cadastrados.txt", nomeUsuario, nomeUsuario);
        System.out.println("Dados do usuário editados com sucesso!");
    }

    private void excluirUsuario() {
        System.out.println("Excluir Usuário:");
        System.out.println("Digite o nome do usuário que deseja excluir:");
        String nomeUsuario = scanner.nextLine();
        fileManager.excluirItem("alunos_cadastrados.txt", nomeUsuario);
        System.out.println("Usuário excluído com sucesso!");
    }
}



    
        
    


