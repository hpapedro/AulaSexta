package factory;

public class notificacaoEmail implements iNotificacao {
    @Override
    public void enviar(String mensagem){
        //Implementa a lógica do email
        System.out.println("Email:" + mensagem);
    }
}   