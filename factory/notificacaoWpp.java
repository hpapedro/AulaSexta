package factory;

public class notificacaoWpp implements iNotificacao {
    @Override
    public void enviar(String mensagem){
        System.out.println("Whatsapp" + mensagem);
    }
    
}