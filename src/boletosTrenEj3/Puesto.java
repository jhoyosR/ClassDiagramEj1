package boletosTrenEj3;

public class Puesto {
    private int numero;
    private String estado;

    public Puesto(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
        return "Puesto{" +
                "numero=" + numero +
                ", estado='" + estado + '\'' +
                '}';
    }
}
