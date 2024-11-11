public class vendedor extends pessoa {
    public Double salario = 0.0;

    @Override
    public void Salvar(){
        super.Salvar();
        System.out.println("Na tabela de vendedores");
    }
}
