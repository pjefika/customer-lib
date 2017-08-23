/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.customer;

/**
 *
 * @author G0041775
 */
public class InventarioLinha {

    private TipoLinha tipo;

    private String dn, central;

    public InventarioLinha() {
    }

    public TipoLinha getTipo() {
        return tipo;
    }

    public void setTipo(TipoLinha tipo) {
        this.tipo = tipo;
    }

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public String getCentral() {
        return central;
    }

    public void setCentral(String central) {
        this.central = central;
    }

}
