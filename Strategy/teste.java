package Strategy;

public class teste {
    public static void main(String[]args){
        Context context = new Context(new AddStrategy());
        System.out.println("Resultado da soma: " + context.executeStrategy(5, 3));

        context.setStrategy(new SubtractStrategy());
        System.out.println("Resultado da subtração: " + context.executeStrategy(5, 3));

        context.setStrategy(new MultiplyStrategy());
        System.out.println("Resultado da Multiplicação: " + context.executeStrategy(5, 3));
    }
}
