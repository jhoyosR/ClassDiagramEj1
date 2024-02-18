package reservaVuelosEj5;

public class Persona {
    private String nombre;
    private String id;
    private String contacto;

    public Persona(String nombre, String id, String contacto) {
        this.nombre = nombre;
        this.id = id;
        this.contacto = contacto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getContacto() {
        return contacto;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", contacto='" + contacto + '\'' +
                '}';
    }
}
