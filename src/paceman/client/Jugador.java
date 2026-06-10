package paceman.client;

import paceman.communication.EventoJugador;
import paceman.enums.Direccion;
import paceman.game.Partida;

public class Jugador extends Cliente {
    private int idJugador;
    private Partida partidaActual;

    public Jugador() {
        this(0, "");
    }

    public Jugador(int idJugador, String nombre) {
        super(idJugador, nombre);
        this.idJugador = idJugador;
    }

    public void moverPaCEMan(Direccion direccion) {
        if (partidaActual != null && partidaActual.getPaCEMan() != null) {
            partidaActual.getPaCEMan().mover(direccion);
        }
    }

    public void enviarEvento(EventoJugador evento) {
    }

    public int getIdJugador() {
        return idJugador;
    }

    public Partida getPartidaActual() {
        return partidaActual;
    }

    public void setPartidaActual(Partida partidaActual) {
        this.partidaActual = partidaActual;
    }
}
