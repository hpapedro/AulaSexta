package prova;

public class RelatorioEXCEL implements IRelatorio {
    @Override
    public void gerar(String dados) {
        System.out.println("Gerando relatório em Excel com os dados: " + dados);
        // Implementação da lógica para gerar o Excel
    }
}

