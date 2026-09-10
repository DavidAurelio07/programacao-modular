package Questão01;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite a altura (ex: 1,85 ou 1.85): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o peso (ex: 89,0 ou 89.0): ");
        double peso = scanner.nextDouble();


        Pessoa p1 = new Pessoa(nome, sobrenome, idade, altura, peso);


        String IMCresultado = String.format("%.2f",p1.CalculaIMC());
        System.out.println(IMCresultado);

        p1.InformaObesidade();
    }
}
