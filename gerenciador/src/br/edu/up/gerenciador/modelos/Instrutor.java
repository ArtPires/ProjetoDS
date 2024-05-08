package br.edu.up.gerenciador.modelos;

public class Instrutor {
    
    private String nome;
    private String tipoDeAula;
    private Boolean disponibilidade;

    // --- Construtores da classe Instrutor --- //
    // Construtor define um novo Instrutor com a disponibilidade como true por padrão 
    public Instrutor(String nome, String tipoDeAula) {
        this.nome = nome;
        this.tipoDeAula = tipoDeAula;
        this.disponibilidade = true;
    }

    // Construtor define um novo Instrutor com os atributos passados na inicialização do objeto
    public Instrutor(String nome, String tipoDeAula, Boolean disponibilidade) {
        this.nome = nome;
        this.tipoDeAula = tipoDeAula;
        this.disponibilidade = disponibilidade;
    }

    // --- Métodos de get e set da classe Instrutor --- //

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDeAula() {
        return tipoDeAula;
    }

    public void setTipoDeAula(String tipoDeAula) {
        this.tipoDeAula = tipoDeAula;
    }

    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }


    // --- Métodos próprios da classe Instrutor --- //

    public Integer montarTreino(Aluno aluno, Treino treino){
        
        if (!treino.filtroDeTreino(aluno)) {
            System.out.println("Erro ao criar treino do tipo: " + treino.getTipoDeTreino() + 
                                " para o aluno: " + aluno.getNome());
            return -1;
        }

        



        return 0;
    }

    public void darAula(){
        
    }

    @Override
    public String toString() {
        return "Aluno {" + 
        "nome='" + this.nome + '\'' +
        " tipo de aula='" + this.tipoDeAula + '\'' +
        " disponibilidade='" + this.disponibilidade + 
        '}';
    }
}
