package paceman.consumable;

import paceman.game.Posicion;

public class Fruta extends Consumible {
    private String nombre;

    public Fruta() {
        this(0, new Posicion(), 100, "");
    }

    public Fruta(int id, Posicion posicion, int valorPuntos, String nombre) {
        super(id, posicion, valorPuntos);
        this.nombre = nombre;
    }

    @Override
    public int consumir() {
        return getValorPuntos();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
