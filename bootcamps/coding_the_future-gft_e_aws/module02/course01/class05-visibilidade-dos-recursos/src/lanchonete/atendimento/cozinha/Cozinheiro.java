package lanchonete.atendimento.cozinha;

public class Cozinheiro {

    // Pode ser default
    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCÃO...");
    }

    // Pode ser default
    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCÃO...");
    }

    // Pode ser default
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche() {
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER...");
    }

    private void prepararVitamina() {
        System.out.println("PREPARANDO SUCO...");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE...");
    }

    private void selecionarIngredientesVitamina() {
        System.out.println("SELECIONANDO FRUTA, LEITE E SUCO...");
    }

    private void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES...");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA LIQUIDIFICADOR...");
    }

    public void fritarIngredientesLanche() {
        System.out.println("FRITANDO A CARNE E O OVO PARA HAMBURGUER...");
    }

    /*
    private void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }
     */

    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }


}
