package trabalho;

public class TesteAccountManager {
    public static void main(String[] args) {
        // Criando múltiplas instâncias de clientes
        Cliente cliente1 = new Cliente("123", "Alice");
        Cliente cliente2 = new Cliente("456", "Bob");
        Cliente cliente3 = new Cliente("789", "Charlie");

        // Realizando operações nas contas
        cliente1.depositar(500);
        cliente2.depositar(300);
        cliente3.depositar(200);

        // Exibindo os saldos
        System.out.println("Saldo de Alice: " + cliente1.verSaldo());
        System.out.println("Saldo de Bob: " + cliente2.verSaldo());
        System.out.println("Saldo de Charlie: " + cliente3.verSaldo());

        // Bob tenta sacar mais do que tem
        System.out.println("Bob tenta sacar R$400:");
        cliente2.sacar(100); // Deve mostrar saldo insuficiente
        System.out.println("Saldo de Bob após tentativa de saque: " + cliente2.verSaldo());

        // Alice saca uma quantia válida
        System.out.println("Alice tenta sacar R$200:");
        cliente1.sacar(200);
        System.out.println("Saldo de Alice após saque: " + cliente1.verSaldo());

        // Listando todas as contas ativas
        System.out.println("\nListando todas as contas ativas:");
        AccountManager.getInstance().listarContasAtivas();

        // Testando o Singleton: criando uma nova instância do AccountManager
        AccountManager novoManager = AccountManager.getInstance();
        System.out.println("\nTestando nova instância do AccountManager:");
        System.out.println("Saldos após criação de nova instância (mesmo objeto):");
        novoManager.listarContasAtivas();
    }
}
