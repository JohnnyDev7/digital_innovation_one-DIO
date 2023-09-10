public class SistemaCadastro {
    public static void main(String[] args) {
        // Criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("123.456.789-00", "MARCOS");

        // Definimos o endereço de marcos
        marcos.setEndereco("RUAS DAS MARIAS");

        // E como definir o nome e cpf do marcos?

        // Imprimindo o marcos sem o nome e cpf
        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}