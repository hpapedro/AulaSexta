package singleton;

public class teste {
    public static void main(String[] args){
        Conta cc = Conta.getInstace("123");
        cc.depositar(100000.00);
        System.out.println(cc.getSaldo());

        Conta cc_m = Conta.getInstace("345");
        
    }
}
