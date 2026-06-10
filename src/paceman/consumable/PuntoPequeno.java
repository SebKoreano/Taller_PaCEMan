package paceman.consumable;

import paceman.game.Posicion;

public class PuntoPequeno extends Consumible {
    public PuntoPequeno() {
        super(0, new Posicion(), 10);
    }

    public PuntoPequeno(int id, Posicion posicion, int valorPuntos) {
        super(id, posicion, valorPuntos);
    }

    @Override
    public int consumir() {
        return getValorPuntos();
    }
}
