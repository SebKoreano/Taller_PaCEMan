package paceman.entity;

import paceman.game.Posicion;

public abstract class EntidadJuego {
    private int id;
    private Posicion posicion;

    public EntidadJuego() {
        this(0, new Posicion());
    }

    public EntidadJuego(int id, Posicion posicion) {
        this.id = id;
        this.posicion = posicion;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
