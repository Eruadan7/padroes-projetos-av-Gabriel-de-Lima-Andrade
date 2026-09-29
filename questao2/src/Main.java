public class Main {
    public static void main(String[] args) {
        double valor = 1000.0;

        // 1. Pedido para o BRASIL
        System.out.println("=== PAÍS: BRASIL ===");
        PaisFactory brasilFactory = new BrasilFactory(false, "Pix"); // Estadual + Pix
        Checkout.finalizarPedido(brasilFactory, valor, "Rua ABC, 123, São Paulo, SP, 12345-678");

        // 2. Pedido para os EUA
        System.out.println("=== PAÍS: EUA ===");
        PaisFactory euaFactory = new EUAFactory("California", true);
        Checkout.finalizarPedido(euaFactory, valor, "123 Main St, Los Angeles, CA 90001");

        // 3. Pedido para a ALEMANHA
        System.out.println("=== PAÍS: ALEMANHA ===");
        PaisFactory alemanhaFactory = new AlemanhaFactory(false);
        Checkout.finalizarPedido(alemanhaFactory, valor, "Hauptstr. 1, 10115 Berlin");
    }
}
