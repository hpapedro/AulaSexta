public class teste {
    public static void main(String[] args) {
        //construir um objeto da classe vededor
        vendedor Vendedor = new vendedor();
        Vendedor.nome = "Pedro de Lara";
        Vendedor.salario = 12000.0;
        Vendedor.Salvar();
        cliente Cliente = new cliente();
        Cliente.nome ="Pedro Alves";
        Cliente.Salvar();
        Cliente.Consultar();
    }
}
