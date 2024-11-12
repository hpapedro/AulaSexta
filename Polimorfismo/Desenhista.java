package Polimorfismo;

public class Desenhista {
    public Double getPerimetro(iFigura f){
        System.out.println("objectId" + f);
        return f.Calcular_perimetro();
    }

    public void alterarcor(retangulo r){
        r.cor = "Vermelho";
    }
}
