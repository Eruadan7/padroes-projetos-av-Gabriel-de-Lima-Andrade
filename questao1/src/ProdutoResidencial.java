package questao1.src;
public class ProdutoResidencial extends Produto {
    // atributos específicos

    private Double valorImovel;
    private boolean possuiEscritura;
    private boolean possuiContratoDeLocacao;

    // construtor

    public ProdutoResidencial(String segurado, String numeroApolice, Double valorImovel, boolean possuiEscritura, boolean possuiContratoDeLocacao) {
        super(segurado, numeroApolice);
        this.valorImovel = valorImovel;

        this.possuiEscritura = possuiEscritura;
        this.possuiContratoDeLocacao = possuiContratoDeLocacao;

    }

    // métodos
    @Override
    public boolean validarContratacao() {
        return (possuiEscritura || possuiContratoDeLocacao);

    }

    @Override
    public Double calcularPremio() {
        double premio_anual = (valorImovel * 0.015);
        return premio_anual;
    }

    @Override
    public String listarDocumentos() {
        return "Documentos necessários: escritura ou contrato de locação";
    }
    
    @Override
    public String gerarResumo() {
        if (validarContratacao()) {
            return "Resumo da Apólice:\n" +
               "Número: " + getNumeroApolice() + "\n" +
               "Segurado: " + getSegurado() + "\n" +
               "Data de Emissão: " + getDataEmissao() + "\n" +
               "Prêmio mensal: R$ " + String.format("%.2f", calcularPremio()/12) + "\n" +
               "Documentos Exigidos: " + listarDocumentos();
        } return null;
    }
}
