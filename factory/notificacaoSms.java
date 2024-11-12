package factory;

public class notificacaoSms implements iNotificacao {
    @Override
    public void enviar(String mensagem){
        //Implementa a lógica do sms
        System.out.println("Sms:" + mensagem);
    }
    
}