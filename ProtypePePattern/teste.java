package ProtypePePattern;

public class teste {
    public static void main(String[] args){
        circulo c1 = new circulo(10, 20, 30);
        c1.desenhar();
        System.out.println(c1);

        //copiar com uso de "=" duplica referencia não é o que desejamos 
        circulo c2 = (circulo) c1.clone();
        c2.desenhar();//deve reproduizer o mesmo estado do c1
        System.out.println(c2);//nao pode repetir o objectId do c1
    }   

    
}
