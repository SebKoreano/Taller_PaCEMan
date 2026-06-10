package paceman.observer;

import paceman.communication.EventoJuego;

public interface Subscriber {
    void update(EventoJuego evento);
}
