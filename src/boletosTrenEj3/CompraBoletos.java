package boletosTrenEj3;

public class CompraBoletos {
    public void reservarBoletos(Cliente cliente, Viaje viaje, Puesto puesto){
        Boleto boleto = new Boleto(cliente, viaje, puesto);
        puesto.reservar();
        System.out.println("Boleto reservado para el viaje " + viaje);
    }

    public void comprarBoletos(Cliente cliente, Viaje viaje, Puesto puesto) {
        Boleto boleto = new Boleto(cliente, viaje, puesto);
        puesto.ocupar();
        System.out.println("Boleto comprado para el viaje " + viaje);
    }
}
