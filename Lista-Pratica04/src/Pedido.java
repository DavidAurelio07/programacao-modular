public abstract class Pedido {
    private int id;
    private String nomeCliente;
    private double valor;
    private StatusPedido status;
    private String categoria;

    public Pedido(int id, String nomeCliente, double valor, StatusPedido status, String categoria) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor digitado é inválido");
        }

        this.id = id;
        this.nomeCliente = nomeCliente;
        this.valor = valor;
        this.status = status;
        this.categoria = categoria;
    }

    public void processarPedido() throws PedidoInvalidoException {
        if (getStatus().equals(StatusPedido.CANCELADO)) {
            throw new PedidoInvalidoException("Pedido já tem o Status Cancelado! Erro");
        } else if (getStatus().equals(StatusPedido.ENTREGUE)) {
            throw new PedidoInvalidoException("Pedido já foi entregue!");
        } else {
            setStatus(StatusPedido.PROCESSADO);
            System.out.println("Pedido processado com sucesso!");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
