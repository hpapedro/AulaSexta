package prova;


public class teste {
    public static void main(String[] args){
        ServiceRelatorio service = new ServiceRelatorio();
        service.gerarRelatorio(new RelatorioEXCELFactory(), "teste de mensagem");
    }
    
}
