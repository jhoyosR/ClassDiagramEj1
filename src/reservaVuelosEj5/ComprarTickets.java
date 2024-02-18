package reservaVuelosEj5;

public class ComprarTickets {
    public void reservarBoletos(Pasajero pasajero, Vuelo vuelo, Asiento asiento){
        Reserva reserva = new Reserva (pasajero, vuelo, asiento);
        asiento.reservar();
        System.out.println("Ticket reservado para el " + vuelo);
    }

    public void comprarBoletos(Pasajero pasajero, Vuelo vuelo, Asiento asiento){
        Reserva reserva = new Reserva (pasajero, vuelo, asiento);
        asiento.ocupar();
        System.out.println("Ticket comprado para el " + vuelo);
    }
}
