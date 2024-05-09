package br.edu.up.gerenciador.modelos;

import java.util.ArrayList;

public class InterfaceInstrutor {

    private static ArrayList<Instrutor> listaInstrutores = new ArrayList<>();

    public InterfaceInstrutor(Integer criar) {
        if (criar == 0){   
            criarInstrutor();
        }
    }

    private void criarInstrutor(){
        Instrutor instrutor01 = new Instrutor("Cleiton", "Musculação");
        Instrutor instrutor02 = new Instrutor("Maria", "Musculação");
        Instrutor instrutor03 = new Instrutor("Jéssica", "Musculação");
        Instrutor instrutor04 = new Instrutor("Juarez", "Musculação");

        listaInstrutores.add(instrutor01);
        listaInstrutores.add(instrutor02);
        listaInstrutores.add(instrutor03);
        listaInstrutores.add(instrutor04);
    }

    public ArrayList<Instrutor> getListaInstrutores() {
        return listaInstrutores;
    }

    public void setListaInstrutores(ArrayList<Instrutor> listaInstrutores) {
        this.listaInstrutores.addAll(listaInstrutores);
    }

}
