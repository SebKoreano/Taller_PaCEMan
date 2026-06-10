package paceman.entity;

import paceman.consumable.Consumible;
import paceman.enums.Direccion;
import paceman.game.Posicion;

public class PaCEMan extends EntidadJuego {
    private Direccion direccionActual;

    public PaCEMan() {
        this(0, new Posicion(), Direccion.DERECHA);
    }

    public PaCEMan(int id, Posicion posicion, Direccion direccionActual) {
        super(id, posicion);
        this.direccionActual = direccionActual;
    }

    public void mover(Direccion direccion) {
        direccionActual = direccion;
        setPosicion(getPosicion().mover(direccion));
    }

    public void comer(Consumible consumible) {
        if (consumible != null) {
            consumible.consumir();
        }
    }

    public Direccion getDireccionActual() {
        return direccionActual;
    }

    public void setDireccionActual(Direccion direccionActual) {
        this.direccionActual = direccionActual;
    }
}
