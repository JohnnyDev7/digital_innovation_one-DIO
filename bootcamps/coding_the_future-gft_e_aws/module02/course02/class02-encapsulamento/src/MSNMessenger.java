public class MSNMessenger {

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    // Antes do Encapsulamento este método tinha visibilidade "public"
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado à internet");
    }

    // Antes do Encapsulamento este método tinha visibilidade "public"
    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o historico da mensagem");
    }
}
