package paceman.game;

public class Puntuacion {
    private int puntos;

    public Puntuacion() {
        this(0);
    }

    public Puntuacion(int puntos) {
        this.puntos = puntos;
    }

    public void sumar(int cantidad) {
        puntos += cantidad;
    }

    public boolean verificarVidaExtra() {
        return puntos > 0 && puntos % 10000 == 0;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
