package reservaVuelosEj5;

public class VuelosMain {
    public static void main(String[] args) {
        Pasajero pasajero1 = new Pasajero("Pablo", "897854", "3152319413", "Inexistente");
        Pasajero pasajero2 = new Pasajero("Carolina", "324765", "3134539090", "Inexistente");

        Asiento asientoReservado = new Asiento(18, "Ejecutiva");
        Asiento asientoComprado = new Asiento(3, "Primera clase");

        Avion avion1 = new Avion("Boeing 737", 140, asientoReservado);
        Avion avion2 = new Avion("Airbus 320", 60, asientoComprado);

        Vuelo vuelo1 = new Vuelo(132, "Bogotá - Madrid", "22/01/2025", "9:00", "23:00 Hora local", avion1);
        Vuelo vuelo2 = new Vuelo(543, "Medellín - Toronto", "30/05/2024", "14:00", "21:00 Hora local", avion2);

        ComprarTickets comprarTickets = new ComprarTickets();

        comprarTickets.reservarBoletos(pasajero1, vuelo1, asientoReservado);
        comprarTickets.comprarBoletos(pasajero2, vuelo2, asientoComprado);
    }
}
