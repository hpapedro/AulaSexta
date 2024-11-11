package prova;

public class RelatorioCSVFactory extends relatorioFactory {
    @Override
    public IRelatorio criarRelatorio() {
        return new RelatorioCSV();
    }
}
