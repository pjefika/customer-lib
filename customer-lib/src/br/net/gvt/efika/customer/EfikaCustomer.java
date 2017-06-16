/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.customer;

public class EfikaCustomer {

    private String designador, instancia, designadorAcesso;

    private InventarioRede rede;

    private InventarioServico servicos;

    public EfikaCustomer() {
        rede = new InventarioRede();
        servicos = new InventarioServico();
    }

    public EfikaCustomer(String designador) {
        this.designador = designador;
        rede = new InventarioRede();
        servicos = new InventarioServico();
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
    
    

}