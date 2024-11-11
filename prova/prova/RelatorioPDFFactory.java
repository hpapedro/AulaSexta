package prova;

public class RelatorioPDFFactory extends relatorioFactory {
    @Override
    public IRelatorio criarRelatorio() {
        return new RelatorioPDF();
    }
}
