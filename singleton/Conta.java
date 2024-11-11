package singleton;

public class Conta {
    private static Conta instacia;
    private String numero_conta = "";
    private Double saldo = 0.0;

    private Conta(String numero_conta){
        this.numero_conta = numero_conta;
    }

    public static Conta getInstace(String numero_conta){
        if(instacia == null){
            instacia = new Conta(numero_conta);
        }
        return instacia;
    }

    public void depositar(Double valor){
        this.saldo += valor;
    }

    public void sacar(Double valor){
        this.saldo -= valor;
    }

    public Double getSaldo(){
        return this.saldo;
    }
}
