# Fundamentos da Programação Orientada a Objetos com Java

## Construtores

Sabemos que para criar um objeto na linguagem Java utilizamos a seguinte estrutura de código:

    Classe novoObjeto = new Classe();

Desta forma será criado um novo objeto na memória, este recurso também é conhecido como instanciar um novo objeto.

Muitas das vezes já queremos que na criação (instanciação) de um objeto, a linguagem já solicite para quem for criar este novo objeto defina algumas propriedades essesnciais. Abaixo iremos ilustrar uma classe *Pessoa* onde a mesma terá os atributos *Nome*, *CPF* e *Endereço*.

    public class Pessoa {
        private String nome;
        private String cpf;
        private String endereco;

        public String getNome() {
            return nome;
        }

        public String getCpf() {
            return cpf;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        } 
        
        // ...
        // Setters de nome e cpf?
    }

Criaremos uma *Pessoa* mas como não temos o *setter* para nome e cpf, este objeto não tem como receber estes valores.

    public class SistemaCadastro {
        public static void main(String[] args) {
            // Criamos uma pessoa no sistema
            Pessoa marcos = new Pessoa();

            // Definimos o endereço de marcos
            marcos.setEndereco("RUAS DAS MARIAS");

            // E como definir o nome e cpf do marcos?

            // Imprimindo o marcos sem o nome e cpf
            System.out.println(marcos.getNome() + "-" + marcos.getCpf());
        }
    }

Entrando em cena o construtor para criar nossos objetos já com valores requeridos no momento da criação/instanciação (new).

    public class Pessoa {
        private String nome;
        private String cpf;
        private String endereco;

        // Método construtor
        // O nome deverá ser igual ao nome da classe
        public Pessoa(String cpf, String nome) {
            this.cpf = cpf;
            this.nome = nome;
        }

        // ...
        // Getters
        // Setters
    }
