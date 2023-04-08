package subsistema2.cep;

import one.digitalinnovation.gof.singleton.SingletonEager;

public class CepApi {

    private static CepApi instance = new CepApi();

    public CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String recuperarCidade(String cep) {
        return "Araraquara";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}
