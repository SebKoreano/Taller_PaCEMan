package paceman.entity;

import paceman.enums.TipoFantasma;
import paceman.game.Posicion;

public class Fantasma extends EntidadJuego {
    private TipoFantasma tipo;
    private int velocidad;

    public Fantasma() {
        this(0, new Posicion(), TipoFantasma.ROJO, 1);
    }

    public Fantasma(int id, Posicion posicion, TipoFantasma tipo, int velocidad) {
        super(id, posicion);
        this.tipo = tipo;
        this.velocidad = velocidad;
    }

    public void mover() {
    }

    public void cambiarVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public TipoFantasma getTipo() {
        return tipo;
    }

    public void setTipo(TipoFantasma tipo) {
        this.tipo = tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
