package Questão02;
import java.util.Scanner;

public class Main {
    public static void Main(String[] args){
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Idade: ");
            int idade = input.nextInt();

            System.out.print("Pontuação de Coragem: ");
            double coragem = input.nextDouble();

            System.out.print("Pontuação de Inteligência: ");
            double inteligencia = input.nextDouble();

            System.out.print("Pontuação de Ambição: ");
            double ambicao = input.nextDouble();

            System.out.print("Pontuação de Lealdade: ");
            double lealdade = input.nextDouble();

            System.out.print("Pontuação de Estratégia: ");
            double estrategia = input.nextDouble();

            System.out.print("Pontuação de Criatividade: ");
            double criatividade = input.nextDouble();

            Aluno aluno = new Aluno(nome, idade, coragem, inteligencia, ambicao, lealdade, estrategia, criatividade);

            aluno.calcularCasa();

            System.out.println("");
            System.out.println("Se deseja finalizar o programa digite SAIR: ");
            String resposta = input.nextLine();
            if (resposta.equals("SAIR")){
                break;
            }
            System.out.println("");
        }
    }
}
