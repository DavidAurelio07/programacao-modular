public class ContatoEmergencia extends Contato{
    private int grauPrioridade; // valor de 1 a 5

    public ContatoEmergencia(String nome, String email, String telefone, int grauPrioridade) {
        super(nome, email, telefone);
        this.grauPrioridade = grauPrioridade;
    }
}
