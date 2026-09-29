public class Checkout {
    public static void finalizarPedido(PaisFactory factory, double valor, String endereco) {
        System.out.println("=== PROCESSSANDO PEDIDO ===\n");

        DocumentoFiscal doc = factory.criarDocumentoFiscal();
        Pagamento pag = factory.criarPagamento();
        Etiqueta etiq = factory.criarEtiqueta();

        System.out.println("=== DOCUMENTO FISCAL ===");
        System.out.println(doc.gerar());
        System.out.println("Imposto: " + String.format("%.2f", doc.calcularImposto(valor)));

        System.out.println("\n=== PAGAMENTO ===");
        System.out.println(pag.processar(valor));

        System.out.println("\n=== ETIQUETA ===");
        System.out.println(etiq.gerar(endereco));

        System.out.println("\nFormato CEP: " + etiq.getFormatoCEP());
        System.out.println("\n Pedido finalizado com sucesso!\n");
    }
}
