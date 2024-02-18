package reservaVuelosEj5;

public class Pasajero extends Persona {
    private String historialReservas;

    public Pasajero(String nombre, String id, String contacto, String historialReservas) {
        super(nombre, id, contacto);
        this.historialReservas = historialReservas;
    }

    public String getHistorialReservas() {
        return historialReservas;
    }

    public void setHistorialReservas(String historialReservas) {
        this.historialReservas = historialReservas;
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "historialReservas='" + historialReservas + '\'' +
                '}';
    }
}
