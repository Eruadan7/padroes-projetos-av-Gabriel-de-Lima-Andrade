package questao1.src;
public class Cliente {
    public static void main(String[] args) {

        // 1. APÓLICE AUTO
        System.out.println("=== TESTE APÓLICE AUTO ===");
        
        iFabricaProduto fabricaAuto = new FabricaAuto(
            "Carlos Silva",      // segurado
            75000.0,             // valorFipe
            22,                  // idadeCondutor
            1,                   // tempoHabilitacao (anos)
            60000.0,             // coberturaTerceiros (>= 50000)
            true,                // possuiCnh
            true,                // possuiCrlv
            true                 // possuiComprovanteResidencia
        );
        
        Produto auto = fabricaAuto.criarProduto();
        
        if (auto.validarContratacao()) {
            System.out.println(auto.gerarResumo());
            System.out.println(" Contratação APROVADA!\n");
        } else {
            System.out.println(auto.listarDocumentos()); 
            System.out.println(" Contratação REJEITADA! Verifique os requisitos.\n");
        }


        // 2. APÓLICE RESIDENCIAL

        System.out.println("=== TESTE APÓLICE RESIDENCIAL ===");
        
        iFabricaProduto fabricaResidencial = new FabricaResidencial(
            "Maria Oliveira",    // segurado
            500000.0,            // valorImovel
            true,                // possuiEscritura
            false              // possuiContratoDeLocacao
        );
        
        Produto residencial = fabricaResidencial.criarProduto();
        
        if (residencial.validarContratacao()) {
            System.out.println(residencial.gerarResumo());
            System.out.println(" Contratação APROVADA!\n");
        } else {
            System.out.println(residencial.listarDocumentos());
            System.out.println(" Contratação REJEITADA! Verifique os requisitos.\n");
        }

        // 3. APÓLICE VIDA

        System.out.println("=== TESTE APÓLICE VIDA ===");
        
        iFabricaProduto fabricaVida = new FabricaVida(
            "João Pereira",      // segurado
            35,                  // idadeSegurado
            600000.0,            // capitalSegurado (acima de 500k)
            false,               // isFumante
            true,                // possuiAtestadoMedico (obrigatório pois capital > 500k)
            true,                // possuiCpf
            true                 // possuiDocumentoIdentidade
        );
        
        Produto vida = fabricaVida.criarProduto();
        
        if (vida.validarContratacao()) {
            System.out.println(vida.gerarResumo());
            System.out.println(" Contratação APROVADA!\n");
        } else {
            System.out.println(vida.listarDocumentos());
            System.out.println(" Contratação REJEITADA! Verifique os requisitos.\n");
        }
    }
}