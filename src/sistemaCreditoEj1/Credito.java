package sistemaCreditoEj1;

public class Credito {
    private String estado;

    SolicitudCredito creditoAsociado;

    public Credito(SolicitudCredito creditoAsociado) {
        this.creditoAsociado = creditoAsociado;
    }

    public Object obtenerSolicitudCredito(){
        return this.creditoAsociado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void aprobar(){
        setEstado("aprobado");
    }

    public void rechazar(){
        setEstado("rechazado");
    }

}
