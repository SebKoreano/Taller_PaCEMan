package paceman.game;

public class Laberinto {
    private int filas;
    private int columnas;
    private Celda[][] celdas;

    public Laberinto() {
        this(0, 0);
    }

    public Laberinto(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.celdas = new Celda[filas][columnas];
    }

    public boolean esPosicionValida(Posicion posicion) {
        if (posicion == null) {
            return false;
        }

        int x = posicion.getX();
        int y = posicion.getY();
        return x >= 0 && x < columnas && y >= 0 && y < filas;
    }

    public boolean quedanPuntosPequenos() {
        return false;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public Celda[][] getCeldas() {
        return celdas;
    }
}
