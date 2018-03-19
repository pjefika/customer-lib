/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.customer.model.manobra.dto;

import br.net.gvt.efika.customer.model.dto.CustomerRequest;
import br.net.gvt.efika.customer.model.manobra.enums.MotivoManobraEnum;

/**
 *
 * @author G0042204
 */
public class ManobraAnaliticoRequest extends CustomerRequest {

    private MotivoManobraEnum motivo;

    public ManobraAnaliticoRequest() {
    }

    public MotivoManobraEnum getMotivo() {
        return motivo;
    }

    public void setMotivo(MotivoManobraEnum motivo) {
        this.motivo = motivo;
    }

}
