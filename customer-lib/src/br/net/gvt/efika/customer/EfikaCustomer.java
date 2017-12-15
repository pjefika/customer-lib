/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.customer;

import java.util.ArrayList;
import java.util.List;

public class EfikaCustomer {

    private String designador, instancia, designadorAcesso, designadorTv;

    private InventarioRede rede;

    private InventarioServico servicos;

    private InventarioLinha linha;

    private InventarioRadius radius;

    private List<CustomerAssert> asserts;

    public EfikaCustomer() {
        rede = new InventarioRede();
        servicos = new InventarioServico();
        linha = new InventarioLinha();
        radius = new InventarioRadius();
        asserts = new ArrayList<>();
    }

    public EfikaCustomer(String designador) {
        this.designador = designador;
        rede = new InventarioRede();
        servicos = new InventarioServico();
        linha = new InventarioLinha();
        radius = new InventarioRadius();
    }

    public String getDesignador() {
        return designador;
    }

    public void setDesignador(String designador) {
        this.designador = designador;
    }

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

    public String getDesignadorAcesso() {
        return designadorAcesso;
    }

    public void setDesignadorAcesso(String designadorAcesso) {
        this.designadorAcesso = designadorAcesso;
    }

    public InventarioRede getRede() {
        return rede;
    }

    public void setRede(InventarioRede rede) {
        this.rede = rede;
    }

    public InventarioServico getServicos() {
        return servicos;
    }

    public void setServicos(InventarioServico servicos) {
        this.servicos = servicos;
    }

    public List<CustomerAssert> getAsserts() {
        return asserts;
    }

    public void setAsserts(List<CustomerAssert> asserts) {
        this.asserts = asserts;
    }

    public InventarioLinha getLinha() {
        return linha;
    }

    public void setLinha(InventarioLinha linha) {
        this.linha = linha;
    }

    public String getDesignadorTv() {
        return designadorTv;
    }

    public void setDesignadorTv(String designadorTv) {
        this.designadorTv = designadorTv;
    }

    public InventarioRadius getRadius() {
        return radius;
    }

    public void setRadius(InventarioRadius radius) {
        this.radius = radius;
    }

}
