package paceman.game;

import paceman.enums.Direccion;

public class Posicion {
    private int x;
    private int y;

    public Posicion() {
        this(0, 0);
    }

    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Posicion mover(Direccion direccion) {
        if (direccion == null) {
            return new Posicion(x, y);
        }

        switch (direccion) {
            case ARRIBA:
                return new Posicion(x, y - 1);
            case ABAJO:
                return new Posicion(x, y + 1);
            case IZQUIERDA:
                return new Posicion(x - 1, y);
            case DERECHA:
                return new Posicion(x + 1, y);
            default:
                return new Posicion(x, y);
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
