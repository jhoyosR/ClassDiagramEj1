package boletosTrenEj3;

public class Viaje {
    private String fecha;
    private String horaSalida;
    private String horaLlegada;
    Tren tren;

    public Viaje(String fecha, String horaSalida, String horaLlegada, Tren tren) {
        this.fecha = fecha;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.tren = tren;
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

    public Tren getTren() {
        return tren;
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "fecha='" + fecha + '\'' +
                ", horaSalida='" + horaSalida + '\'' +
                ", horaLlegada='" + horaLlegada + '\'' +
                ", tren=" + tren +
                '}';
    }
}
