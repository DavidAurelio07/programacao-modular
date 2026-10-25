public class ContatoPessoal  extends Contato{
    private String dataAniversario;
    private String parentesco;

    public ContatoPessoal(String nome, String email, String telefone, String dataAniversario, String parentesco) {
        super(nome, email, telefone);
        this.dataAniversario = dataAniversario;
        this.parentesco = parentesco;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
