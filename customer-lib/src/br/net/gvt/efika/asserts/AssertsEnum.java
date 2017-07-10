/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.asserts;

/**
 *
 * @author G0042204
 */
public enum AssertsEnum {

    HAS_SYNC("Possui sincronismo?"),
    AUTH_ABERTURA_ORDEM("Houve autenticação após abertura da ordem?"),
    LINHA_MUDA("Reclamação Linha Muda?"),
    RUIDO_CHIADO("Reclamação Ruído e Chiado?"),
    IS_ADSL("É ADSL?"),
    IS_REPARO("É Reparo?"),
    CIRCUITO_ATIVO("Circuito Ativo no TBS?"),
    HAS_BLOQUEIO_RADIUS("Possui bloqueio no Radius?"),
    DIVERGENCIA_TBS_RADIUS("Existe divergencia entre TBS e Radius?");

    private final String pergunta;

    private AssertsEnum(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getPergunta() {
        return pergunta;
    }

}
