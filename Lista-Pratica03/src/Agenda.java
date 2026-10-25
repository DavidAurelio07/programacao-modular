import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;
    private int quantContatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
        this.quantContatos = 0;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public int getQuantContatos() {
        return  quantContatos = contatos.size();
    }

    public void setQuantContatos(int quantContatos) {
        this.quantContatos = quantContatos;
    }

    public void addContato (Contato c){
        contatos.add(c);
    }

    public void removeContato(Contato c){
        contatos.remove(c);
    }

    public void nomeContato(String nome){
        for (int i = 0; i < contatos.size(); i++){
            if (contatos.get(i).getNome().equals(nome)) {
                System.out.println("Contato encontrado:");
                System.out.println("Nome: "+contatos.get(i).getNome());
                System.out.println("Email: "+contatos.get(i).getEmail());
                System.out.println("Telefone: "+contatos.get(i).getTelefone());
            }else{
                System.out.println("Contato não encontrado");
            }
        }
    }

    public void emailContato(String email){
        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i).getEmail().equals(email)){
                System.out.println("Contato encontrado:");
                System.out.println("Nome: "+contatos.get(i).getNome());
                System.out.println("Email: "+contatos.get(i).getEmail());
                System.out.println("Telefone: "+contatos.get(i).getTelefone());
            }else{
                System.out.println("Contato não encontrado");
            }
        }
    }

    public  void telefoneContato(String telefone){
        for(int i = 0; i < contatos.size(); i++){
            if (contatos.get(i).getTelefone().equals(telefone)){
                System.out.println("Contato encontrado:");
                System.out.println("Nome: "+contatos.get(i).getNome());
                System.out.println("Email: "+contatos.get(i).getEmail());
                System.out.println("Telefone: "+contatos.get(i).getTelefone());
            }else{
                System.out.println("Contato não encontrado");
            }
        }
    }
}
