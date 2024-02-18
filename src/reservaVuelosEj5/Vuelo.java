package reservaVuelosEj5;

public class Vuelo {
    private int numero;
    private String ruta;
    private String fecha;
    private String horaSalida;
    private String horaLlegada;

    Avion avion;

    public Vuelo(int numero, String ruta, String fecha, String horaSalida, String horaLlegada, Avion avion) {
        this.numero = numero;
        this.ruta = ruta;
        this.fecha = fecha;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.avion = avion;
    }

    public int getNumero() {
        return numero;
    }

    public String getRuta() {
        return ruta;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public Avion getAvion() {
        return avion;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "numero=" + numero +
                ", ruta='" + ruta + '\'' +
                ", fecha='" + fecha + '\'' +
                ", horaSalida='" + horaSalida + '\'' +
                ", horaLlegada='" + horaLlegada + '\'' +
                ", avion=" + avion +
                '}';
    }
}
