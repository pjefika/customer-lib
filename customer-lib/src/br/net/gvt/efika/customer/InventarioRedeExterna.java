package br.net.gvt.efika.customer;

/**
 *
 * @author G0042204
 */
public class InventarioRedeExterna {

    private TipoRede tipo;
    private OrigemRede origem;
    private OrigemPlanta planta;

    public InventarioRedeExterna() {
    }

    public OrigemRede getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemRede origem) {
        this.origem = origem;
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

}
