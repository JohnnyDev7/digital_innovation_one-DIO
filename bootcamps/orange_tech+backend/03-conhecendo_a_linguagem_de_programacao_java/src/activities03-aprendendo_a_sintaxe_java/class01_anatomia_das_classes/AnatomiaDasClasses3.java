package activities03.class01_anatomia_das_classes;
/**
 * DECLARANDO VARIÁVEIS E MÉTODOS
 * Como identificar a diferença entre declaração de variáveis e métodos em nosso
 * programa? Existe uma estrutura comum para ambas as finalidades.
 */

public class AnatomiaDasClasses3 {


    /**
     * A declaração de métodos em Java segue uma estrutura bem simples:
     * <TipoRetorno> <nomeObjetivoNoInfinitivo> <([Parâmetros])>
     * Exemplos:
     * int somar (int numeroUm, int numero2)
     * String formatarCep (long cep)
     */
    public static void main (String [] args) {

        // Declarar uma variável em Java segue sempre a seguinte estrutura:
        // <Tipo> <nomeBemDefinido> = <Atribuição> (Opcional)
        // Exemplos:
        int idade = 23;
        double altura = 1.70;
        String cachorro; // Variável do tipo String sem valor atribuído na declaração.

        String meuNome = "Johnny";
        int anoFabricacao = 2000;
        boolean verdadeiro = true; // Variáveis do tipo boolean recebem valores "true" ou "false".
        anoFabricacao = 2001;

        String primeiroNome = "Johnny";
        String sobrenome = "Souza";
        String nomeCompleto = nomeCompleto(primeiroNome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String sobrenome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(sobrenome);
    }
    
}