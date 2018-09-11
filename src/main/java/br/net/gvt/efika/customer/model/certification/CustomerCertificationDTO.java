package br.net.gvt.efika.customer.model.certification;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;
import br.net.gvt.efika.fulltest.model.fulltest.FullTest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author G0042204
 */
public class CustomerCertificationDTO extends Certificational {

    private String id;

    private List<CertificationBlock> blocks;

    private Date dataInicio;

    private Date dataFim;

    private EfikaCustomer customer;

    private String executor, fkId;

    private FullTest fulltest;

    @JsonIgnore
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public CustomerCertificationDTO() {
        dataInicio = Calendar.getInstance().getTime();
    }

    public List<CertificationBlock> getBlocks() {
        if (blocks == null) {
            blocks = new ArrayList<>();
        }
        return blocks;
    }

    public void setBlocks(List<CertificationBlock> blocks) {
        this.blocks = blocks;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EfikaCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(EfikaCustomer customer) {
        this.customer = customer;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public FullTest getFulltest() {
        return fulltest;
    }

    public void setFulltest(FullTest fulltest) {
        this.fulltest = fulltest;
    }

    public String getFkId() {
        return fkId;
    }

    public void setFkId(String fkId) {
        this.fkId = fkId;
    }

}
