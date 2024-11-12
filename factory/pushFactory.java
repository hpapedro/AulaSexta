package factory;

public class pushFactory extends notificacaoFactory {
    @Override
    public iNotificacao criarNotificacao(){
        return new notificacaoPush();
    }    
}