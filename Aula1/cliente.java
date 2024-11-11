public class cliente extends pessoa {
    @Override
    public void Salvar(){
        super.Salvar();
        System.out.println("Na tabela de clientes");  
    }
    @Override
    public void Consultar(){
        super.Consultar();
        System.out.println("Na tabela de clientes");  
    }

}