package paceman.consumable;

import paceman.game.Posicion;

public class Pastilla extends Consumible {
    private int duracionEfecto;

    public Pastilla() {
        this(0, new Posicion(), 50, 0);
    }

    public Pastilla(int id, Posicion posicion, int valorPuntos, int duracionEfecto) {
        super(id, posicion, valorPuntos);
        this.duracionEfecto = duracionEfecto;
    }

    public void activarEfecto() {
    }

    @Override
    public int consumir() {
        activarEfecto();
        return getValorPuntos();
    }

    public int getDuracionEfecto() {
        return duracionEfecto;
    }

    public void setDuracionEfecto(int duracionEfecto) {
        this.duracionEfecto = duracionEfecto;
    }
}
