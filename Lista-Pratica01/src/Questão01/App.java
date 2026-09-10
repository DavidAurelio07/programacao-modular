package Questão01;

public class App {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("David","Aurélio",18,1.85,89.0);


        String IMCresultado = String.format("%.2f",p1.CalculaIMC());
        System.out.println(IMCresultado);

        p1.InformaObesidade();
    }
}
