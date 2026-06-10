package paceman.communication;

public class EventoJuego {
    private String tipo;
    private String descripcion;

    public EventoJuego() {
        this("", "");
    }

    public EventoJuego(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
