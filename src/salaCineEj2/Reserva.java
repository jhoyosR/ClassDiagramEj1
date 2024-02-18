package salaCineEj2;

import java.util.List;

public class Reserva {
    Cliente cliente;
    Funcion funcion;

    private List<Asiento> asientos;

    public Cliente getCliente() {
        return cliente;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }
}
