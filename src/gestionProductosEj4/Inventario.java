package gestionProductosEj4;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;


    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void modificarProducto(String nombre, String nuevaDescripcion, int nuevoPrecio, int nuevoStock) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                producto.descripcion = nuevaDescripcion;
                producto.precio = nuevoPrecio;
                producto.stock = nuevoStock;
                return;
            }
        }
        System.out.println("Producto no encontrado");
    }

    public void eliminarProducto(String nombre) {
        productos.removeIf(producto -> producto.getNombre().equals(nombre));
    }

    public void mostrarInventario() {
        System.out.println("Inventario:");
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre() +
                    ", Descripción: " + producto.getDescripcion() +
                    ", Precio: " + producto.getPrecio() +
                    ", Stock: " + producto.getStock());
        }
    }
}
