package sistemaCreditoEj1;

public class Cliente extends Persona {

    private String historialCrediticio;
    private int ingresos;
    public Cliente(String nombre, String id, String direccion, String historialCrediticio, int ingresos) {
        super(nombre, id, direccion);
        this.historialCrediticio = historialCrediticio;
        this.ingresos = ingresos;
    }
    public String getHistorialCrediticio() {
        return historialCrediticio;
    }

    public int getIngresos() {
        return ingresos;
    }


}
