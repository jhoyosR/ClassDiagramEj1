package reservaVuelosEj5;

public class Reserva {
    Pasajero pasajero;
    Vuelo vuelo;
    Asiento asiento;

    public Reserva(Pasajero pasajero, Vuelo vuelo, Asiento asiento) {
        this.pasajero = pasajero;
        this.vuelo = vuelo;
        this.asiento = asiento;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "pasajero=" + pasajero +
                ", vuelo=" + vuelo +
                ", asiento=" + asiento +
                '}';
    }
}
