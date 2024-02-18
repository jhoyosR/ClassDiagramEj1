package sistemaCreditoEj1;

public class SolicitudCredito {
    private String tipoCredito;
    private int monto;
    private String plazo;
    private double tasaInteres;

    Cliente cliente;

    public SolicitudCredito(String tipoCredito, int monto, String plazo, double tasaInteres, Cliente cliente) {
        this.tipoCredito = tipoCredito;
        this.monto = monto;
        this.plazo = plazo;
        this.tasaInteres = tasaInteres;
        this.cliente = cliente;
    }

    public Object obtenerCliente(){
        return this.cliente;
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
