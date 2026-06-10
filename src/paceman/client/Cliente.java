package paceman.client;

import paceman.communication.EstadoPartida;
import paceman.communication.EventoJuego;
import paceman.observer.Subscriber;

public abstract class Cliente implements Subscriber {
    private int idCliente;
    private String nombre;
    private boolean conectado;

    public Cliente() {
        this(0, "");
    }

    public Cliente(int idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.conectado = false;
    }

    public void conectar() {
        conectado = true;
    }

    public void desconectar() {
        conectado = false;
    }

    public void recibirEstado(EstadoPartida estado) {
    }

    @Override
    public void update(EventoJuego evento) {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isConectado() {
        return conectado;
    }
}
