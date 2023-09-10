package apps;

// Aplicando o conceito de abstração
public abstract class ServicoMensagemInstantanea {

    // Antes de aplicar o conceito de "Abstração"
    /*
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
    */

    // Aplicando o conceito de "Abstração"
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    // Somente os filhos conhecem este método
    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado à internet");
    }
}
