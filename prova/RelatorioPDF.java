package prova;

public class RelatorioPDF implements IRelatorio {
    @Override
    public void gerar(String dados) {
        System.out.println("Gerando relatório em PDF com os dados: " + dados);
        // Implementação da lógica para gerar o PDF
    }
}
