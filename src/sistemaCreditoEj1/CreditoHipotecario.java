package sistemaCreditoEj1;

public class CreditoHipotecario extends Credito{
    private String propiedad;

    public CreditoHipotecario(String nombre, String id, String direccion, String historialCrediticio, int ingresos, String tipoCredito, int monto, String plazo, double tasaInteres, String estado, String propiedad) {
        super(nombre, id, direccion, historialCrediticio, ingresos, tipoCredito, monto, plazo, tasaInteres, estado);
        this.propiedad = propiedad;
    }

    public String getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }
}
