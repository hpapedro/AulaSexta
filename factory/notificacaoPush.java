package factory;

public class notificacaoPush implements iNotificacao {
    @Override
    public void enviar(String mensagem){
        //Implementa a lógica do push
        System.out.println("Push:" + mensagem);
    }
    
}