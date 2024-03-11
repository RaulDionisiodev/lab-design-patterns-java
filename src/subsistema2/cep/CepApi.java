package subsistema2.cep;

public class CepApi {

    public static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instancia;
    }

    public static String recuperarCidade(String cep) {
        return "Duque de Caxias";
    }

    public static String recuperarEstado(String cep) {
        return "Rio de Janeiro";
    }
}
