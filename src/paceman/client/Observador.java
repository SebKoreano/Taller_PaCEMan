package paceman.client;

import paceman.game.Partida;

public class Observador extends Cliente {
    private Partida partidaObservada;

    public Observador() {
        super();
    }

    public Observador(int idCliente, String nombre) {
        super(idCliente, nombre);
    }

    public void observarPartida(Partida partida) {
        partidaObservada = partida;
    }

    public Partida getPartidaObservada() {
        return partidaObservada;
    }
}
