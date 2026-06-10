package paceman.game;

import java.util.ArrayList;
import java.util.List;

import paceman.client.Jugador;
import paceman.communication.EstadoPartida;
import paceman.consumable.Consumible;
import paceman.entity.Fantasma;
import paceman.entity.PaCEMan;

public class Partida {
    private int idPartida;
    private int nivel;
    private int vidas;
    private EstadoPartida estado;
    private Jugador jugador;
    private PaCEMan paCEMan;
    private Laberinto laberinto;
    private List<Fantasma> fantasmas;
    private List<Consumible> consumibles;
    private Puntuacion puntuacion;

    public Partida() {
        this(0, null);
    }

    public Partida(int idPartida, Jugador jugador) {
        this.idPartida = idPartida;
        this.nivel = 1;
        this.vidas = 3;
        this.jugador = jugador;
        this.paCEMan = new PaCEMan();
        this.laberinto = new Laberinto();
        this.fantasmas = new ArrayList<>();
        this.consumibles = new ArrayList<>();
        this.puntuacion = new Puntuacion();
        this.estado = new EstadoPartida(idPartida, nivel, vidas, puntuacion.getPuntos());
    }

    public void iniciar() {
    }

    public void actualizar() {
    }

    public void subirNivel() {
        nivel++;
    }

    public void perderVida() {
        if (vidas > 0) {
            vidas--;
        }
    }

    public void agregarFantasma(Fantasma fantasma) {
        if (fantasma != null) {
            fantasmas.add(fantasma);
        }
    }

    public void agregarConsumible(Consumible consumible) {
        if (consumible != null) {
            consumibles.add(consumible);
        }
    }

    public void verificarColisiones() {
    }

    public int getIdPartida() {
        return idPartida;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVidas() {
        return vidas;
    }

    public EstadoPartida getEstado() {
        return estado;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public PaCEMan getPaCEMan() {
        return paCEMan;
    }

    public Laberinto getLaberinto() {
        return laberinto;
    }

    public List<Fantasma> getFantasmas() {
        return fantasmas;
    }

    public List<Consumible> getConsumibles() {
        return consumibles;
    }

    public Puntuacion getPuntuacion() {
        return puntuacion;
    }
}
