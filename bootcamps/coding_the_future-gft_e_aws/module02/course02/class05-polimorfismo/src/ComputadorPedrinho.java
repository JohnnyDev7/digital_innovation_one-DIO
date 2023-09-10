import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        // Antes de aplicar o conceito de "Polimorfismo"
        /*
        System.out.println("MSN");
        apps.MSNMessenger msn = new apps.MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("FACEBOOK");
        apps.FacebookMessenger fcb = new apps.FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("TELEGRAM");
        apps.Telegram tlg = new apps.Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
        */

        // NÃO SE SABE QUE APP, MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "tlg";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
