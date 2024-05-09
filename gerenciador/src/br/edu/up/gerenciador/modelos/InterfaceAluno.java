package br.edu.up.gerenciador.modelos;

import java.util.ArrayList;

public class InterfaceAluno {

    private ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public InterfaceAluno() { criarAlunos(); }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    private void criarAlunos(){
        Aluno aluno01 = new Aluno("Artur", 1.75f, 60.0f, 20);
        Aluno aluno02 = new Aluno("Amanda", 1.62f, 65.0f, 22);
        Aluno aluno03 = new Aluno("João", 1.50f, 90.0f, 16);
        Aluno aluno04 = new Aluno("Wilson", 2.30f, 50.0f, 26);

        listaAlunos.add(aluno01);
        listaAlunos.add(aluno02);
        listaAlunos.add(aluno03);
        listaAlunos.add(aluno04);
    }

    public void pedirFichaDeTreino(Aluno aluno){

        InterfaceInstrutor interfaceInstrutores = new InterfaceInstrutor(0);
        Instrutor instrutor = new Instrutor();

        instrutor.setListaInstrutores(interfaceInstrutores.getListaInstrutores());

        for (Instrutor meuInstrutor: instrutor.getListaInstrutores()){
            if (meuInstrutor.getDisponibilidade() == true){
                if (!aluno.solicitarFichaDeTreino(meuInstrutor)){
                    System.out.println("Não foi possivel gerar uma ficha de treino");
                } 
                
                break;
            }
        }
    }

}
