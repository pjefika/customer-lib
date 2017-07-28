/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.customer;

import br.net.gvt.efika.asserts.AssertsEnum;

/**
 *
 * @author G0042204
 */
public class CustomerAssert {

    private AssertsEnum asserts;

    private Boolean value;

    public CustomerAssert() {
    }

    public CustomerAssert(AssertsEnum asserts, Boolean value) {
        this.asserts = asserts;
        this.value = value;
    }

    public AssertsEnum getAsserts() {
        return asserts;
    }

    public Boolean getValue() {
        return value;
    }

    public void setAsserts(AssertsEnum asserts) {
        this.asserts = asserts;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        return equals((CustomerAssert)obj);
    }

    public boolean equals(CustomerAssert dev) {
        return dev.getAsserts().equals(this.getAsserts()) && dev.getValue().equals(this.getValue());
    }

}
