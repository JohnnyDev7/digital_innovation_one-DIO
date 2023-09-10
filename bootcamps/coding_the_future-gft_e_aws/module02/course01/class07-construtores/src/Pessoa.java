public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    // Método construtor
    // O nome deverá ser igual ao nome da classe
    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

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
