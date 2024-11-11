package trabalho;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    private static AccountManager instancia;
    private List<Conta> contas; // Alterado para "Conta"

    // Construtor privado para o Singleton
    private AccountManager() {
        this.contas = new ArrayList<>();
    }

    // Método estático para obter a instância Singleton
    public static synchronized AccountManager getInstance() {
        if (instancia == null) {
            instancia = new AccountManager();
        }
        return instancia;
    }

    // Método para criar uma nova conta
    public void criarConta(String contaId) {
        Conta novaConta = new Conta(contaId); // Alterado para "Conta"
        contas.add(novaConta);
    }

    // Método para depositar valor em uma conta específica
    public void depositar(String contaId, double valor) {
        Conta conta = encontrarConta(contaId); // Alterado para "Conta"
        if (conta != null) {
            conta.depositar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    // Método para sacar valor de uma conta específica
    public void sacar(String contaId, double valor) {
        Conta conta = encontrarConta(contaId); // Alterado para "Conta"
        if (conta != null) {
            conta.sacar(valor); // O método sacar já verifica o saldo
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    // Método para ver o saldo de uma conta específica
    public double verSaldo(String contaId) {
        Conta conta = encontrarConta(contaId); // Alterado para "Conta"
        if (conta != null) {
            return conta.getSaldo();
        } else {
            System.out.println("Conta não encontrada.");
            return 0.0; // Retorna 0 se a conta não for encontrada
        }
    }

    // Método para listar todas as contas ativas
    public void listarContasAtivas() {
        for (Conta conta : contas) { // Alterado para "Conta"
            System.out.println("Conta ID: " + conta.getNumeroConta() + ", Saldo: " + conta.getSaldo());
        }
    }

    // Método auxiliar para encontrar uma conta pelo ID
    private Conta encontrarConta(String contaId) { // Alterado para "Conta"
        for (Conta conta : contas) { // Alterado para "Conta"
            if (conta.getNumeroConta().equals(contaId)) {
                return conta;
            }
        }
        return null;
    }
}
