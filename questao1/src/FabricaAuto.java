package questao1.src;
public class FabricaAuto implements iFabricaProduto {
    private static int contador = 0;
    private String segurado;
    private double valorFipe;
    private int idadeCondutor;
    private int tempoHabilitacao;
    private boolean possuiCnh;
    private boolean possuiCrlv;

    // Construtor da fábrica recebe TODOS os dados do cliente
    public FabricaAuto(String segurado, double valorFipe, int idadeCondutor,
                    int tempoHabilitacao, double coberturaTerceiros,
                    boolean possuiCnh, boolean possuiCrlv,
                    boolean possuiComprovanteResidencia) {
                    this.segurado = segurado;
                    this.valorFipe = valorFipe;
                    this.idadeCondutor = idadeCondutor;
                    this.tempoHabilitacao = tempoHabilitacao;
                    this.possuiCnh = possuiCnh;
                    this.possuiCrlv = possuiCrlv;
    }

    @Override
    public Produto criarProduto() {
        contador++;
        String numeroApolice = "AUTO-" + (contador);
        return new ProdutoAuto(segurado, numeroApolice, valorFipe, idadeCondutor,
                               tempoHabilitacao, possuiCnh,
                               possuiCrlv);
    }
}
