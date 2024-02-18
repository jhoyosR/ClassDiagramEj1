package boletosTrenEj3;

public class BoletosTrenMain {
    public static void main(String[] args) {
    Cliente cliente1 = new Cliente("Daniel", "132343", "Avenida 34", "Aprobadas");
    Cliente cliente2 = new Cliente("Felipe", "341244", "Calle 23", "Aprobadas");

    Puesto puestoReservado = new Puesto(1);

    Puesto puestoComprado = new Puesto(2);

    Vagon vagon1 = new Vagon("Clase económica",30, puestoReservado);
    Vagon vagon2 = new Vagon("Clase turista",50, puestoComprado);

    Tren tren1 = new Tren(1, "Vienna - Berlín", vagon1);
    Tren tren2 = new Tren(2, "Madrid - Andorra", vagon2);

    Viaje viaje1 = new Viaje("17/04/2024", "5:00", "7:30", tren1);
    Viaje viaje2 = new Viaje("08/06/2024", "1:00", "4:00", tren2);

    CompraBoletos compraBoletos = new CompraBoletos();

    compraBoletos.reservarBoletos(cliente1, viaje1, puestoReservado);

    compraBoletos.comprarBoletos(cliente2, viaje2, puestoComprado);
    }
}
