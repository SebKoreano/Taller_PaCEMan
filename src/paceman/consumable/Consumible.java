package paceman.consumable;

import paceman.entity.EntidadJuego;
import paceman.game.Posicion;

public abstract class Consumible extends EntidadJuego {
    private int valorPuntos;

    public Consumible() {
        this(0, new Posicion(), 0);
    }

    public Consumible(int id, Posicion posicion, int valorPuntos) {
        super(id, posicion);
        this.valorPuntos = valorPuntos;
    }

    public int consumir() {
        return valorPuntos;
    }

    public int getValorPuntos() {
        return valorPuntos;
    }

    public void setValorPuntos(int valorPuntos) {
        this.valorPuntos = valorPuntos;
    }
}
