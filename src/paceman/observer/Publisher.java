package paceman.observer;

import paceman.communication.EventoJuego;

public interface Publisher {
    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notify(EventoJuego evento);
}
