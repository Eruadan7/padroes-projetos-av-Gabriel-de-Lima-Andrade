import java.time.LocalDate;

public abstract class Produto {
    
    // atributos comúns
    private String segurado;
    private LocalDate dataEmissao;
    private String numeroApolice;
    private Double valorPremio;
    public int contador;

    // construtor
    public Produto(String segurado, String numeroApolice) {
        this.segurado = segurado;
        this.numeroApolice = numeroApolice;
        this.dataEmissao = LocalDate.now();
    }

    // métodos
    public abstract boolean validarContratacao();

    public abstract Double calcularPremio();

    public abstract String listarDocumentos();

    public abstract String gerarResumo();

    public String getSegurado() {
        return this.segurado;
    }

    public LocalDate getDataEmissao() {
        return this.dataEmissao;
    }

    public String getNumeroApolice() {
        return this.numeroApolice;
    }

    public Double getValorPremio() {
        return this.valorPremio;
    }
}
