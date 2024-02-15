package sistemaCreditoEj1;

public class Credito extends SolicitudCredito {
    private String estado;

    public Credito(String nombre, String id, String direccion, String historialCrediticio, int ingresos, String tipoCredito, int monto, String plazo, double tasaInteres, String estado) {
        super(nombre, id, direccion, historialCrediticio, ingresos, tipoCredito, monto, plazo, tasaInteres);
        this.estado = estado;
    }

    public void obtenerSolicitudCredito(){
        //????//
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
