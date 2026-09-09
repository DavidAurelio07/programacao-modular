package Questão01;

public class App {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("David","Aurélio",18,1.85,89.0);


        System.out.println("IMC: " +p1.CalculaIMC());
    }
}
