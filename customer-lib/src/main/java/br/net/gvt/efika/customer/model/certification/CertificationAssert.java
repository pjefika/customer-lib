/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.customer.model.certification;

import br.net.gvt.efika.customer.model.certification.enums.CertificationAssertName;
import br.net.gvt.efika.customer.model.certification.enums.CertificationResult;



/**
 *
 * @author G0041775
 */
public class CertificationAssert {

    private CertificationResult resultado;

    private String orientacao;

    private CertificationAssertName nome;

    public CertificationAssert(CertificationAssertName name) {
        nome = name;
    }

    public CertificationAssert() {
    }

    public CertificationAssert(CertificationAssertName nome, CertificationResult resultado, String orientacao) {
        this.resultado = resultado;
        this.orientacao = orientacao;
        this.nome = nome;
    }

    public CertificationResult getResultado() {
        return resultado;
    }

    public void setResultado(CertificationResult resultado) {
        this.resultado = resultado;
    }

    public String getOrientacao() {
        return orientacao;
    }

    public void setOrientacao(String orientacao) {
        this.orientacao = orientacao;
    }

    public CertificationAssertName getNome() {
        return nome;
    }

    public void setNome(CertificationAssertName nome) {
        this.nome = nome;
    }

}
