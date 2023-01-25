public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        System.out.println("Canal: " + smartTV.canal);
        smartTV.selecionarCanal(12);
        System.out.println("Canal: " + smartTV.canal);

        System.out.println("TV Ligada? " + smartTV.ligada);
        System.out.println("Volume: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("TV Ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("TV Ligada? " + smartTV.ligada);
    }
}
