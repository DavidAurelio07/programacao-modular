package Questão01;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double IMC;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public Pessoa(String nome, String sobrenome,int idade,double altura,double peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public  double CalculaIMC(){
        this.IMC= this.peso/(this.altura*this.altura);
        return this.IMC;
    }

    public void InformaObesidade(){
        if (this.IMC < 18.5){
            System.out.println("Abaixo do peso");
        }else if (this.IMC >= 18.5  && this.IMC <= 24.9){
            System.out.println("Peso Normal");
        }else if (this.IMC >= 25  && this.IMC <= 29.9){
            System.out.println("Sobrepeso");
        }else if (this.IMC >= 30  && this.IMC <= 34.9) {
            System.out.println("Obesidade Grau 1");
        }else if (this.IMC >= 35  && this.IMC <= 39.9){
            System.out.println("Obesidade Grau 2");
        }else{
            System.out.println("Obesidade Grau 3");
        }
    }
}


