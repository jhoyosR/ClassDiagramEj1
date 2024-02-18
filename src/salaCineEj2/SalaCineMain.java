package salaCineEj2;

import java.util.ArrayList;
import java.util.List;

public class SalaCineMain {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan","231341", "Calle 23N", "Al dia");
        Cliente cliente2 = new Cliente("Miguel","75131", "Carrera 23", "Al dia");

        Funcion funcion1 = new Funcion("Pulp Fiction", "20:00", "3", 5500);
        Funcion funcion2 = new Funcion("The Lobster", "18:00", "1", 5500);

        Asiento asiento1 = new Asiento(2,1);
        Asiento asiento2 = new Asiento(7,4);

        Sala sala1 = new Sala(3,"40 personas");
        Sala sala2 = new Sala(1,"42 personas");

        sala1.addAsiento(asiento1);
        sala2.addAsiento(asiento2);

        asiento1.ocupar();
        asiento2.ocupar();

        System.out.println(cliente1.getNombre() + ", la película " + funcion1.getPelicula() + " es en la sala " + sala1.getNumero() + " y su asiento es en la columna " + asiento1.getColumna() + " fila " + asiento1.getFila());
        System.out.println(cliente2.getNombre() + ", la película " + funcion2.getPelicula() + " es en la sala " + sala2.getNumero() + " y su asiento es en la columna " + asiento2.getColumna() + " fila " + asiento2.getFila());


    }
}
