package questao1.src;
public class FabricaResidencial implements iFabricaProduto {
    private static int contador = 0;
    private String segurado;
    private double valorImovel;

    private boolean possuiEscritura;
    private boolean possuiContratoDeLocacao;


    public FabricaResidencial(String segurado, double valorImovel,
                              boolean possuiEscritura, boolean possuiContratoDeLocacao) {
        this.segurado = segurado;
        this.valorImovel = valorImovel;
  
        this.possuiEscritura = possuiEscritura;
        this.possuiContratoDeLocacao = possuiContratoDeLocacao;
     
    }

    @Override
    public Produto criarProduto() {
        contador++;
        String numeroApolice = "RES-" + contador;
        return new ProdutoResidencial(segurado, numeroApolice, valorImovel,
                                      possuiEscritura, possuiContratoDeLocacao
                                      );
    }
}