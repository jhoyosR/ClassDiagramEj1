package salaCineEj2;

public class Funcion {
    public String pelicula;
    public String horaInicio;
    public String sala;
    public int precioEntrada;

    public Funcion(String pelicula, String horaInicio, String sala, int precioEntrada) {
        this.pelicula = pelicula;
        this.horaInicio = horaInicio;
        this.sala = sala;
        this.precioEntrada = precioEntrada;
    }

    public String getPelicula() {
        return pelicula;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getSala() {
        return sala;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    @Override
    public String toString() {
        return "Funcion{" +
                "pelicula='" + pelicula + '\'' +
                ", horaInicio='" + horaInicio + '\'' +
                ", sala='" + sala + '\'' +
                ", precioEntrada=" + precioEntrada +
                '}';
    }
}
