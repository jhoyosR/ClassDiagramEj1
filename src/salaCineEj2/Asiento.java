package salaCineEj2;

public class Asiento {
    public int fila;
    public int columna;
    private String estado;

    public Asiento(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.estado = "disponible";
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void reservar(){
        setEstado("reservado");
    }

    public void ocupar(){
        setEstado("Ocupado");
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "fila=" + fila +
                ", columna=" + columna +
                ", estado='" + estado + '\'' +
                '}';
    }
}
