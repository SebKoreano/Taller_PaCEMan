package paceman.server;

import paceman.consumable.Fruta;
import paceman.consumable.Pastilla;
import paceman.entity.Fantasma;
import paceman.game.Partida;

public class Administrador {
    private String nombre;

    public Administrador() {
        this("");
    }

    public Administrador(String nombre) {
        this.nombre = nombre;
    }

    public void crearFantasma(Partida partida, Fantasma fantasma) {
        if (partida != null) {
            partida.agregarFantasma(fantasma);
        }
    }

    public void crearFruta(Partida partida, Fruta fruta) {
        if (partida != null) {
            partida.agregarConsumible(fruta);
        }
    }

    public void crearPastilla(Partida partida, Pastilla pastilla) {
        if (partida != null) {
            partida.agregarConsumible(pastilla);
        }
    }

    public void modificarVelocidadFantasma(Fantasma fantasma, int velocidad) {
        if (fantasma != null) {
            fantasma.cambiarVelocidad(velocidad);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
