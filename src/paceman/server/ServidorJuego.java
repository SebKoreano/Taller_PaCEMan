package paceman.server;

import java.util.ArrayList;
import java.util.List;

import paceman.client.Cliente;
import paceman.client.Jugador;
import paceman.communication.ComandoAdministrador;
import paceman.communication.EventoJuego;
import paceman.communication.EventoJugador;
import paceman.game.Partida;
import paceman.observer.Publisher;
import paceman.observer.Subscriber;

public class ServidorJuego implements Publisher {
    private List<Partida> partidas;
    private List<Cliente> clientes;
    private List<Subscriber> subscribers;

    public ServidorJuego() {
        this.partidas = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.subscribers = new ArrayList<>();
    }

    public Partida crearPartida(Jugador jugador) {
        Partida partida = new Partida(partidas.size() + 1, jugador);
        partidas.add(partida);
        if (jugador != null) {
            jugador.setPartidaActual(partida);
        }
        return partida;
    }

    public void registrarCliente(Cliente cliente) {
        if (cliente != null) {
            clientes.add(cliente);
            subscribe(cliente);
        }
    }

    public void procesarComando(ComandoAdministrador comando) {
    }

    public void procesarEvento(EventoJugador evento) {
    }

    public void actualizarPartida(Partida partida) {
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        if (subscriber != null && !subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
        }
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notify(EventoJuego evento) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(evento);
        }
    }

    public List<Partida> getPartidas() {
        return partidas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }
}
