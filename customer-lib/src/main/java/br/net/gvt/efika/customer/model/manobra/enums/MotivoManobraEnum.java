/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.customer.model.manobra.enums;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0034481
 */
public enum MotivoManobraEnum {

    AUTH_SINC("Sem Autenticação/Sincronismo"),
    MUDA("Linha Muda"),
    QUEDA("Quedas"),
    RUIDO("Ruído/Chiado"),
    SEMNAVEG("Não Navega"),
    NAO_ATINGE("Não Atinge Velocidade");

    public String motivo;

    private MotivoManobraEnum(String m) {
        this.motivo = m;
    }

    public String getMotivo() {
        return motivo;
    }

}
