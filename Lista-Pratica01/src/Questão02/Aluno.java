package Questão02;

public class Aluno {
    private String nome;
    private int idade;
    private double coragem;
    private double inteligencia;
    private double ambicao;
    private double lealdade;
    private double estrategia;
    private double criatividade;
    private String casa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getCoragem() {
        return coragem;
    }

    public void setCoragem(double coragem) {
        this.coragem = coragem;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(double inteligencia) {
        this.inteligencia = inteligencia;
    }

    public double getAmbicao() {
        return ambicao;
    }

    public void setAmbicao(double ambicao) {
        this.ambicao = ambicao;
    }

    public double getLealdade() {
        return lealdade;
    }

    public void setLealdade(double lealdade) {
        this.lealdade = lealdade;
    }

    public double getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(double estrategia) {
        this.estrategia = estrategia;
    }

    public double getCriatividade() {
        return criatividade;
    }

    public void setCriatividade(double criatividade) {
        this.criatividade = criatividade;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public Aluno(String nome, int idade, double coragem, double inteligencia, double ambicao, double lealdade, double estrategia, double criatividade) {
        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
        this.estrategia = estrategia;
        this.criatividade = criatividade;
    }

    public void exibirInformacoes(){
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(getCoragem());
        System.out.println(getInteligencia());
        System.out.println(getAmbicao());
        System.out.println(getLealdade());
        System.out.println(getCriatividade());
        System.out.println(getEstrategia());
    }

    public void calcularCasa(){
        double casa1= (2 * this.coragem) + this.lealdade;
        double casa2= (2 * this.ambicao) + this.estrategia;
        double casa3 = (2 * this.inteligencia) + this.criatividade;
        double casa4 = ((2 * this.lealdade) + this.coragem) / 3;

        if(casa1 >= casa2 && casa1 >= casa3 && casa1 >= casa4){
            this.casa = "Grifinória";
        }else if (casa2 >= casa3 && casa2 >= casa4){
            this.casa = "Sonserina";
        }else if (casa3 >= casa4){
            this.casa = "Corvinal";
        }else{
            this.casa = "Lufa-Lufa";
        }

        System.out.println(this.casa);
    }
}
