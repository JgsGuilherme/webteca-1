package br.com.fafidev.webteca.entidade.util;

/**
 *
 * @author fernando
 */
public enum TipoTelefone {

    RESIDENCIAL("Residencial"),
    COMERCIAL("Comercial"),
    CELULAR("Celular");
    private final String descricao;

    private TipoTelefone(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
