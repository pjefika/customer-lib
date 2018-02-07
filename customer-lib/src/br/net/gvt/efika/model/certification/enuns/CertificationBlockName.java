/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.model.certification.enuns;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 *
 * @author G0041775
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum CertificationBlockName {

    CADASTRO("Cadastro"),
    CONECTIVIDADE("Conectividade"),
    SERVICOS("Serviços"),
    PERFORMANCE("Performance");

    private final String beautyName;

    private CertificationBlockName(String beautyName) {
        this.beautyName = beautyName;
    }

    public String getBeautyName() {
        return beautyName;
    }

}
