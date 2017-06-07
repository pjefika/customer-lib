/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.efika.cliente;

import java.util.ArrayList;
import java.util.List;


public class Cliente{

    private String designador, instancia, designadorAcesso;

    private List<InventarioRede> rede;

    private List<InventarioServico> servicos;

    public Cliente() {
        rede = new ArrayList<>();
        servicos = new ArrayList<>();
    }

    public Cliente(String designador) {
        this.designador = designador;
        rede = new ArrayList<>();
        servicos = new ArrayList<>();
    }

    public void adicionar(InventarioRede r) {
        this.rede.add(r);
    }

    public void adicionar(InventarioServico s) {
        this.servicos.add(s);
    }

    public String getDesignadorAcesso() {
        return designadorAcesso;
    }

    public void setDesignadorAcesso(String designadorAcesso) {
        this.designadorAcesso = designadorAcesso;
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

    public List<InventarioRede> getRede() {
        return rede;
    }

    public void setRede(List<InventarioRede> rede) {
        this.rede = rede;
    }

    public List<InventarioServico> getServicos() {
        return servicos;
    }

    public void setServicos(List<InventarioServico> servicos) {
        this.servicos = servicos;
    }

}
