package br.edu.up.gerenciador.modelos;

public class Aluno {

    private String nome;
    private Integer matricula;
    private Double altura;
    private Double peso;
    private Integer idade;
    private Double IMC;
    private Double tempoDeTreino;

    // Construtor da classe Aluno com os atributos obrigatórios para a criação de um novo Aluno
    public Aluno(String nome, Integer matricula, Double altura, Double peso, Integer idade, Double tempoDeTreino) {
        this.nome = nome;
        this.matricula = matricula;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
        this.tempoDeTreino = tempoDeTreino;

        // Calcula o IMC do aluno de acordo com a altura e peso informados
        this.IMC = peso / (Math.pow(altura, 2));
    }

    // --- Métodos de get e set da classe Aluno --- //

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getTempoDeTreino() {
        return tempoDeTreino;
    }

    public void setTempoDeTreino(Double tempoDeTreino) {
        this.tempoDeTreino = tempoDeTreino;
    }

    public Double getIMC() {
        return IMC;
    }

    public void setIMC(Double imc) {
        IMC = imc;
    }


    // --- Métodos próprios da classe Aluno --- //
    
    public void realizarMatricula(){

    }

    public void cancelarMatricula(){

    }

    public void pagarMatricula(){

    }

    public Boolean marcarTreino(){
        
        return true;
    }

    public void realizarTreino(){
        
    }

    public void solicitarPlanoDeTreino(){

    }

}
