import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome, email, telefone, dataA, parentesco, empresa, cargo;
        int grauPrioridade;

        Agenda agenda = new Agenda();

        boolean executando = true;

        while (executando) {
            System.out.println("\nMENU - SELECIONE A OPÇÃO QUE DESEJA EXECUTAR -");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Buscar contato por nome");
            System.out.println("3 - Buscar contato por email");
            System.out.println("4 - Buscar contato por telefone");
            System.out.println("5 - Consultar tamanho da Agenda");
            System.out.println("6 - Finalizar");

            int opcao1 = scanner.nextInt();


            switch (opcao1) {
                case 1:
                    System.out.println("\nSelecione o tipo de contato que deseja adicionar:");
                    System.out.println("1 - Contato Pessoal");
                    System.out.println("2 - Contato Profissional");
                    System.out.println("3 - Contato Emergencial");

                    int opcao2 = scanner.nextInt();

                    switch (opcao2) {
                        case 1:
                            System.out.print("Nome: ");
                            nome = scanner.next();
                            System.out.print("Email: ");
                            email = scanner.next();
                            System.out.print("Telefone: ");
                            telefone = scanner.next();
                            System.out.print("Data de Aniversario: ");
                            dataA = scanner.next();
                            System.out.print("Parentesco: ");
                            parentesco = scanner.next();

                            ContatoPessoal cp = new ContatoPessoal(nome, email, telefone, dataA, parentesco);
                            agenda.addContato(cp);
                            break;

                        case 2:
                            System.out.print("Nome: ");
                            nome = scanner.next();
                            System.out.print("Email: ");
                            email = scanner.next();
                            System.out.print("Telefone: ");
                            telefone = scanner.next();
                            System.out.print("Empresa: ");
                            empresa = scanner.next();
                            System.out.print("Cargo: ");
                            cargo = scanner.next();

                            ContatoProfissional cp1 = new ContatoProfissional(nome,email,telefone,empresa,cargo);
                            agenda.addContato(cp1);
                            break;

                        case 3:
                            System.out.print("Nome: ");
                            nome = scanner.next();
                            System.out.print("Email: ");
                            email = scanner.next();
                            System.out.print("Telefone: ");
                            telefone = scanner.next();
                            System.out.print("Grau de Prioridade (int): ");
                            grauPrioridade = scanner.nextInt();

                            ContatoEmergencia ce = new ContatoEmergencia(nome,email,telefone,grauPrioridade);
                            agenda.addContato(ce);
                            break;

                        default:
                            System.out.println("Tipo de contato inválido.");
                            break;
                    }
                    break; // Break do case 1 principal

                case 2:
                    System.out.println("Digite o nome do contato que deseja puxar: ");
                    agenda.nomeContato(scanner.next());
                    break;
                case 3:
                    System.out.println("Digite o email do contato que deseja puxar: ");
                    agenda.emailContato(scanner.next());
                    break;
                case 4:
                    System.out.println("Digite o telefone do contato que deseja puxar: ");
                    agenda.telefoneContato(scanner.next());
                    break;
                case 5:
                    System.out.println("O tamanho da agenda de contatos é :"+agenda.getQuantContatos());
                    break;
                case 6:
                    System.out.println("Programa finalizado!");
                    executando = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}

