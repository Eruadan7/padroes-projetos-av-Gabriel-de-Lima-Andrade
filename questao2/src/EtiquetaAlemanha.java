public class EtiquetaAlemanha implements Etiqueta {
    @Override
    public String gerar(String endereco) {
        return "Etiqueta Deutsche Post\n" +
               "PLZ: " + formatarPLZ(endereco) + "\n" +
               "Endereço: " + endereco;
    }

    @Override
    public String getFormatoCEP() {
        return "PLZ (12345)";
    }

    private String formatarPLZ(String endereco) {
        return "12345";
    }
}
