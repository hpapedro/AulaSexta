package trabalho;

public class Cliente {

    private String idCliente;
    private String nome;

    public Cliente(String idCliente, String nome) {
        this.idCliente = idCliente;
        this.nome = nome;

        // Inicializa uma conta para o cliente no AccountManager
        AccountManager.getInstance().criarConta(idCliente);
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    // Métodos para interagir com o AccountManager
    public void depositar(double valor) {
        AccountManager.getInstance().depositar(idCliente, valor);
    }

    public void sacar(double valor) {
        AccountManager.getInstance().sacar(idCliente, valor);
    }

    public double verSaldo() {
        return AccountManager.getInstance().verSaldo(idCliente);
    }
}
