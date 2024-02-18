package salaCineEj2;

public class Cliente extends Persona{
    private String historialReservas;

    public Cliente(String nombre, String id, String direccion, String historialReservas) {
        super(nombre, id, direccion);
        this.historialReservas = historialReservas;
    }

    public String getHistorialReservas() {
        return historialReservas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "historialReservas='" + historialReservas + '\'' +
                '}';
    }
}
