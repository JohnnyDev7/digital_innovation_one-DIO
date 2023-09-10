public class ServicoMensagemInstantanea {
    public void enviarMensagem() {
        // Primeiro confirmar se esta conectado à internet
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        // Depois de enviada, salva o historico da mesnsagem
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    // Métodos privados, visíveis somente na classe
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado à internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o historico da mensagem");
    }
}
