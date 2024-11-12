package Polimorfismo;

public class Quadrado implements iFigura {
    public Double lado = 0.0;

    @Override
    public Double Calcular_perimetro(){
        return (this.lado * 4);
    }
    
}
