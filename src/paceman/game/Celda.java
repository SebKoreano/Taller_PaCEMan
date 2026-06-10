package paceman.game;

import paceman.enums.TipoCelda;

public class Celda {
    private TipoCelda tipo;
    private boolean transitable;

    public Celda() {
        this(TipoCelda.CAMINO, true);
    }

    public Celda(TipoCelda tipo, boolean transitable) {
        this.tipo = tipo;
        this.transitable = transitable;
    }

    public boolean esTransitable() {
        return transitable;
    }

    public TipoCelda getTipo() {
        return tipo;
    }

    public void setTipo(TipoCelda tipo) {
        this.tipo = tipo;
    }

    public void setTransitable(boolean transitable) {
        this.transitable = transitable;
    }
}
