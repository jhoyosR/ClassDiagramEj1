package sistemaCreditoEj1;

public class SolicitudCredito extends Cliente {
    private String tipoCredito;
    private int monto;
    private String plazo;
    private double tasaInteres;

    public SolicitudCredito(String nombre, String id, String direccion, String historialCrediticio, int ingresos, String tipoCredito, int monto, String plazo, double tasaInteres) {
        super(nombre, id, direccion, historialCrediticio, ingresos);
        this.tipoCredito = tipoCredito;
        this.monto = monto;
        this.plazo = plazo;
        this.tasaInteres = tasaInteres;
    }

    public void obtenerCliente(){
        //????//
    }

    public String getTipoCredito() {
        return tipoCredito;
    }

    public int getMonto() {
        return monto;
    }

    public String getPlazo() {
        return plazo;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }
}
