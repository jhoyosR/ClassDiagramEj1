package reservaVuelosEj5;

public class Asiento {
    private int numero;
    private String clase;
    private String estado;

    public Asiento(int numero, String clase) {
        this.numero = numero;
        this.clase = clase;
        this.estado = "Disponible";
    }

    public int getNumero() {
        return numero;
    }

    public String getClase() {
        return clase;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void reservar(){
        setEstado("Reservado");
    }

    public void ocupar(){
        setEstado("Ocupado");
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "numero=" + numero +
                ", clase='" + clase + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
