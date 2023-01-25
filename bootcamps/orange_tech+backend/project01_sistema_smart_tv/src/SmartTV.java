public class SmartTV {
    
    boolean ligada = false;
    int canal = 7;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void mudarCanalCima() {
        canal++;
    }

    public void mudarCanalBaixo() {
        canal--;
    }

    public void selecionarCanal(int canal) {
        this.canal = canal;
    }

    public void aumentarVolume() {
        //volume = volume + 1;
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void diminuirVolume() {
        //volume = volume -1;
        volume--;
        System.out.println("Volume: " + volume);
    }
}
