package trabalho;

public class Conta {
    private String numeroConta;
    private double saldo;

    public Conta(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0; // Saldo inicial
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            this.saldo -= valor;
            return true; // Saque bem-sucedido
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false; // Saque falhou
        }
    }
}
