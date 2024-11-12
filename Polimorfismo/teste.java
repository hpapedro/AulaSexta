package Polimorfismo;

public class teste {
    public static void main(String[] args) {
        Desenhista desenhista = new Desenhista();
        Circulo circulo = new Circulo();
        System.out.println(circulo);

        circulo.raio = 10.0;
        System.out.println(desenhista.getPerimetro(circulo));

        // Quadrado quadrado = new Quadrado();
        // quadrado.lado = 10.0;
        // System.out.println(desenhista.getPerimetro(quadrado));

        // Triangulo triangulo = new Triangulo();
        // triangulo.ladoA=2.0;
        // triangulo.ladoB=3.0;
        // triangulo.ladoC=4.0;
        // System.out.println(desenhista.getPerimetro(triangulo));

        retangulo ret = new retangulo();
        ret.cor = "Verde";
        desenhista.alterarcor(ret);
        System.out.println(ret.cor);// Espera-se vermelho
    }

}
