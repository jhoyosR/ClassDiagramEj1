package reservaVuelosEj5;

public class Avion {
    private String modelo;
    private int capacidad;
    Asiento asiento;

    public Avion(String modelo, int capacidad, Asiento asiento) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.asiento = asiento;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Asiento getAsiento(int numero) {
        return asiento;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "modelo='" + modelo + '\'' +
                ", capacidad=" + capacidad +
                ", asiento=" + asiento +
                '}';
    }
}
