package prova;

public class RelatorioEXCELFactory extends relatorioFactory {
    @Override
    public IRelatorio criarRelatorio() {
    return new RelatorioEXCEL();
}    
    
}
