package gestionProductosEj4;

public class ProductosMain {
    public static void main(String[] args) {

    Inventario inventario = new Inventario();

    inventario.agregarProducto(new ProductoPerecedero("Arroz", "Libra de arroz blanco",3000, 50,"23/11/2025"));
    inventario.agregarProducto(new ProductoPerecedero("Pollo", "Muslos de pollo", 12000, 22, "13/09/2024"));
    inventario.agregarProducto(new ProductoPerecedero("Aguacate", "4 aguacates Hass", 10000,5, "27/02/2024"));
    inventario.agregarProducto(new Producto("Atún", "Atún enlatada en aceite de oliva", 9000, 70));

    inventario.modificarProducto("Pollo", "5 muslos de pollo", 15000, 18);

    inventario.eliminarProducto("Aguacate");

    inventario.mostrarInventario();

    }
}
