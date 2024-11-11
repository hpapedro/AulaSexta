package prova;

public class RelatorioCSV implements IRelatorio {
    @Override
    public void gerar(String dados) {
        System.out.println("Gerando relatório em CSV com os dados: " + dados);
        // Implementação da lógica para gerar o CSV
    }
}
