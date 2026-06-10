package paceman.communication;

public class EventoJugador {
    private int idJugador;
    private String accion;

    public EventoJugador() {
        this(0, "");
    }

    public EventoJugador(int idJugador, String accion) {
        this.idJugador = idJugador;
        this.accion = accion;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }
}
