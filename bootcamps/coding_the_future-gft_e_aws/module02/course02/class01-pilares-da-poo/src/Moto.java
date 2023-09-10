public class Moto extends Veiculo {
    /* Atributos e Métodos recebidos por "Herança"
    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    */

    @Override
    public void ligar() {
        System.out.println("MOTO LIGADA");
    }
}
