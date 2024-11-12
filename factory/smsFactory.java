package factory;

public class smsFactory extends notificacaoFactory {
    @Override
    public iNotificacao criarNotificacao(){
        return new notificacaoSms();
    }    
    
}