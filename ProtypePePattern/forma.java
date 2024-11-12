package ProtypePePattern;

abstract class forma {
    private int x, y;
    private String cor;
    private String forma;

    //construtor
    forma(String forma){
        this.forma = forma;
    }

    //assinatura do método de clonagem
    public abstract forma clone();

    /*
     * Os métodos da lógica de negócios podemos ter
     * suas assinaturas definidas na classe abstrata do prototype
     */

     //assinatura de métodos de negócios

     public abstract void desenhar();

     public int getX(){
        return x;
     }

     public void setX(int x){
        this.x = x;
     }

     public int getY(){
        return y;
     }

     public void setY(int y){
        this.y = y;
     }
}
