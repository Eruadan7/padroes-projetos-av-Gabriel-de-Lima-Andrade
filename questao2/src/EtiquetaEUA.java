public class EtiquetaEUA implements Etiqueta {
    @Override
    public String gerar(String endereco) {
        return "Etiqueta USPS\n" +
               "ZIP+4: " + formatarZIP(endereco) + "\n" +
               "Endereço: " + endereco;
    }

    @Override
    public String getFormatoCEP() {
        return "ZIP+4 (12345-6789)";
    }

    private String formatarZIP(String endereco) {
        return "12345-6789";
    }
}
