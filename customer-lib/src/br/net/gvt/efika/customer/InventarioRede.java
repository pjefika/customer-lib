package br.net.gvt.efika.customer;

/**
 *
 * @author G0042204
 */
public class InventarioRede {

    private TipoRede tipo;
    private OrigemRede origem;
    private OrigemPlanta planta;
    private String ipDslam, vendorDslam, modeloDslam, idOnt, terminal;
    private Integer slot, porta, sequencial, logica, rin, vlanVoip, vlanVod, vlanMulticast, cvLan;
    private Boolean bhs;

    public InventarioRede() {
    }

    public OrigemRede getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemRede origem) {
        this.origem = origem;
    }

    public String getIpDslam() {
        return ipDslam;
    }

    public Integer getCvLan() {
        return cvLan;
    }

    public void setCvLan(Integer cvLan) {
        this.cvLan = cvLan;
    }

    public void setIpDslam(String ipDslam) {
        this.ipDslam = ipDslam;
    }

    public String getVendorDslam() {
        return vendorDslam;
    }

    public void setVendorDslam(String vendorDslam) {
        this.vendorDslam = vendorDslam;
    }

    public String getModeloDslam() {
        return modeloDslam;
    }

    public void setModeloDslam(String modeloDslam) {
        this.modeloDslam = modeloDslam;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public Integer getPorta() {
        return porta;
    }

    public void setPorta(Integer porta) {
        this.porta = porta;
    }

    public Integer getSequencial() {
        return sequencial;
    }

    public void setSequencial(Integer sequencial) {
        this.sequencial = sequencial;
    }

    public Integer getLogica() {
        return logica;
    }

    public void setLogica(Integer logica) {
        this.logica = logica;
    }

    public Integer getRin() {
        return rin;
    }

    public void setRin(Integer rin) {
        this.rin = rin;
    }

    public Integer getVlanVoip() {
        return vlanVoip;
    }

    public void setVlanVoip(Integer vlanVoip) {
        this.vlanVoip = vlanVoip;
    }

    public Integer getVlanVod() {
        return vlanVod;
    }

    public void setVlanVod(Integer vlanVod) {
        this.vlanVod = vlanVod;
    }

    public Integer getVlanMulticast() {
        return vlanMulticast;
    }

    public void setVlanMulticast(Integer vlanMulticast) {
        this.vlanMulticast = vlanMulticast;
    }

    public TipoRede getTipo() {
        return tipo;
    }

    public void setTipo(TipoRede tipo) {
        this.tipo = tipo;
    }

    public OrigemPlanta getPlanta() {
        return planta;
    }

    public void setPlanta(OrigemPlanta planta) {
        this.planta = planta;
    }

    public String getIdOnt() {
        return idOnt;
    }

    public void setIdOnt(String idOnt) {
        this.idOnt = idOnt;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public Boolean getBhs() {
        return bhs;
    }

    public void setBhs(Boolean bhs) {
        this.bhs = bhs;
    }

}
