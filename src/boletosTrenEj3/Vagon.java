package boletosTrenEj3;

import salaCineEj2.Asiento;

import java.util.ArrayList;
import java.util.List;

public class Vagon {
    public String tipo;
    public int capacidad;
    Puesto puesto;

    public Vagon(String tipo, int capacidad, Puesto puesto) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.puesto = puesto;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Puesto getPuesto(int numero) {
        return puesto;
    }

    @Override
    public String toString() {
        return "Vagon{" +
                "tipo='" + tipo + '\'' +
                ", capacidad=" + capacidad +
                ", puesto=" + puesto +
                '}';
    }
}
