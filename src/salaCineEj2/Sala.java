package salaCineEj2;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    public int numero;
    public String capacidad;
    private List<Asiento> asientos;

    public Sala(int numero, String capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.asientos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void addAsiento(Asiento asiento){
        asientos.add(asiento);
    }

    public List<Asiento> getAsientos(){
        return asientos;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "numero=" + numero +
                ", capacidad='" + capacidad + '\'' +
                ", asientos=" + asientos +
                '}';
    }
}
