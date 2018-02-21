/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.customer.model.customer.request;

import br.net.gvt.efika.customer.model.customer.EfikaCustomer;

/**
 *
 * @author G0042204
 */
public class EfikaCustomerRequest {

    private EfikaCustomer cust;
    private String executor;

    public EfikaCustomerRequest() {
    }

    public EfikaCustomerRequest(EfikaCustomer cust, String executor) {
        this.cust = cust;
        this.executor = executor;
    }

    public EfikaCustomer getCust() {
        return cust;
    }

    public void setCust(EfikaCustomer cust) {
        this.cust = cust;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }
}
