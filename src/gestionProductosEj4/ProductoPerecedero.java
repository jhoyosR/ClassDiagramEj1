package gestionProductosEj4;

public class ProductoPerecedero extends Producto{
    public String fechaVencimiento;

    public ProductoPerecedero(String nombre, String descripcion, int precio, int stock, String fechaVencimiento) {
        super(nombre, descripcion, precio, stock);
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
}
