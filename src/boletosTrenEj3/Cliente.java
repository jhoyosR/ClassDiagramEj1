package boletosTrenEj3;

public class Cliente extends Persona {
    private String historialCompras;

    public Cliente(String nombre, String id, String direccion, String historialCompras) {
        super(nombre, id, direccion);
        this.historialCompras = historialCompras;
    }

    public String getHistorialCompras() {
        return historialCompras;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "historialCompras='" + historialCompras + '\'' +
                '}';
    }
}
