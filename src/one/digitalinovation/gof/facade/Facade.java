package one.digitalinovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {

    //Essa classe cria uma integração mais simples para acessar dois outros sistemas
    public void migrarCliente (String nome, String cep) {
        String cidade = CepApi.recuperarCidade(cep);
        String estado = CepApi.recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
