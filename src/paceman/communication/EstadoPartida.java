package paceman.communication;

public class EstadoPartida {
    private int idPartida;
    private int nivel;
    private int vidas;
    private int puntos;

    public EstadoPartida() {
        this(0, 1, 3, 0);
    }

    public EstadoPartida(int idPartida, int nivel, int vidas, int puntos) {
        this.idPartida = idPartida;
        this.nivel = nivel;
        this.vidas = vidas;
        this.puntos = puntos;
    }

    public int getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(int idPartida) {
        this.idPartida = idPartida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
