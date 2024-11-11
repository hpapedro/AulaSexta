public abstract class pessoa{

    public String cpf=" ";
    public String nome =" ";
    public String email =" ";

    public void Salvar() {
        //classes nao podem imprimir no console
        System.out.println("Gravando no Banco de Dados");
    }

    public void Consultar(){
        //classes nao podem imprimir no console
        System.out.println("Consultando no Banco de Dados");
    }

}