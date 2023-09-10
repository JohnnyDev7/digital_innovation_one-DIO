public class ComputadorPedrinho {
    public static void main(String[] args) {
        /* Antes do Encapsulamento
        // Abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();

        msn.validarConectadoInternet();
        msn.enviarMensagem();
        msn.salvarHistoricoMensagem();

        msn.receberMensagem();
        */

        // Após o Encapsulamento
        // Abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();

        msn.enviarMensagem();

        msn.receberMensagem();
    }
}
