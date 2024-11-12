package ProtypePePattern;

public class circulo extends forma {
    private int raio;

    public circulo(int x, int y, int raio){
        super("Circulo");
        this.setX(x);
        this.setY(y);
        this.setRaio(raio);
    }

    public forma clone(){
        circulo circulo_clone = new circulo(this.getX(), this.getY(), getRaio());
        return circulo_clone;
    }

    /*
     * Os métodos da lógica de negócios podemos ter
     * suas assinaturas definidadas na classe abstrata do prototype
     */
    //assinatura de métodos de negócios 

    public void desenhar(){
        System.out.println("desenhando o círculo: "+ this.getX() + " "+ this.getY());
    }

    public int getRaio(){
        return raio;
    }
    public void setRaio(int raio){
        this.raio = raio;
    }
}
