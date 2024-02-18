package boletosTrenEj3;

public class Boleto {
    Cliente cliente;
    Viaje viaje;
    Puesto puesto;

    public Boleto(Cliente cliente, Viaje viaje, Puesto puesto) {
        this.cliente = cliente;
        this.viaje = viaje;
        this.puesto = puesto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public Puesto getPuesto() {
        return puesto;
    }
}
