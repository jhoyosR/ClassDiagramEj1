package boletosTrenEj3;

import salaCineEj2.Asiento;

import java.util.ArrayList;
import java.util.List;

public class Tren {
    private int numero;
    private String ruta;
    Vagon vagon;


    public Tren(int numero, String ruta, Vagon vagon) {
        this.numero = numero;
        this.ruta = ruta;
        this.vagon = vagon;
    }

    public int getNumero() {
        return numero;
    }

    public String getRuta() {
        return ruta;
    }

    public Vagon getVagon(String tipo) {
        return vagon;
    }

    @Override
    public String toString() {
        return "Tren{" +
                "numero=" + numero +
                ", ruta='" + ruta + '\'' +
                ", vagon=" + vagon +
                '}';
    }
}
