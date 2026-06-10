package paceman.communication;

public class ComandoAdministrador {
    private String tipo;
    private String datos;

    public ComandoAdministrador() {
        this("", "");
    }

    public ComandoAdministrador(String tipo, String datos) {
        this.tipo = tipo;
        this.datos = datos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }
}
