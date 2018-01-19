/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.model.certification;

import java.util.ArrayList;
import java.util.List;
import model.enuns.CertificationBlockName;

/**
 *
 * @author G0041775
 */
public class CertificationBlock extends Certificational {

    private List<CertificationAssert> asserts;

    private CertificationBlockName nome;

    public CertificationBlock(CertificationBlockName nome) {
        this.nome = nome;
    }

    public List<CertificationAssert> getAsserts() {
        if (asserts == null) {
            asserts = new ArrayList<>();
        }
        return asserts;
    }

    public void setAsserts(List<CertificationAssert> asserts) {
        this.asserts = asserts;
    }

    public CertificationBlockName getNome() {
        return nome;
    }

    public void setNome(CertificationBlockName nome) {
        this.nome = nome;
    }

}
