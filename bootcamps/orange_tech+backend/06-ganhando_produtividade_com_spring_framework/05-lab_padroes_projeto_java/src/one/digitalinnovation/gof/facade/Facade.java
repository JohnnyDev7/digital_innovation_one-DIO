package one.digitalinnovation.gof.facade;

import subsistema1.crm.CRMService;
import subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CRMService.gravarCliente(nome, cep, cidade, estado);
    }

}
