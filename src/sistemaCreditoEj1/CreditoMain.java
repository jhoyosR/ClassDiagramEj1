package sistemaCreditoEj1;

public class CreditoMain {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Luna", "142732","Calle 23 #20", "Bueno", 5000);
        Cliente cliente2 = new Cliente("Maria", "67890", "Avenida 456", "Regular", 3000);

        SolicitudCredito solicitud1 = new SolicitudCredito("Personal", 500, "15 días", 0.1, cliente1);
        SolicitudCredito solicitud2 = new SolicitudCredito("Hipotecario", 1500, "2 meses", 0.4, cliente2);

        Credito credito1 = new Credito(solicitud1);
        Credito credito2 = new CreditoHipotecario(solicitud2, new Propiedad("Avenida 456", 100000));


        credito1.aprobar();
        System.out.println(cliente1.getNombre() + " su solicitud de crédito ha sido aprobada");
        credito2.rechazar();
        System.out.println(cliente2.getNombre() + " su solicitud, lamentablemente, ha sido rechazada");
    }
}
