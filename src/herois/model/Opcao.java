package herois.model;

import herois.exception.OpcaoInvalidaEsception;

public enum Opcao {
    CADASTRAR_HEROI,
    CADASTRAR_VILAO,
    LISTAR,
    SAIR;

    public static Opcao converter(int codigo) throws OpcaoInvalidaEsception {
        if (codigo == 0 || codigo > 4)
            throw new OpcaoInvalidaEsception("Opção invalida!");
        return Opcao.values()[codigo -1];

    }
}
