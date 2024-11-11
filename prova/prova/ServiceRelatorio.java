package prova;

public class ServiceRelatorio {

    // Método que aceita a fábrica e os dados como argumento
    public void gerarRelatorio(relatorioFactory factory, String dados) {
        IRelatorio relatorio = factory.criarRelatorio();
        relatorio.gerar(dados);
    }
}

