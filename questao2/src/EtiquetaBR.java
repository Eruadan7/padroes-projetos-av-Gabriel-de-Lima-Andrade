public class EtiquetaBR implements Etiqueta {
    @Override
    public String gerar(String endereco) {
        return "Etiqueta dos Correios\n" +
               "CEP: " + formatarCEP(endereco) + "\n" +
               "Endereço: " + endereco;
    }

    @Override
    public String getFormatoCEP() {
        return "00000-000";
    }

    private String formatarCEP(String endereco) {
        // Simulação: extrai CEP do endereço ou gera um padrão
        return "12345-678";
    }
}
