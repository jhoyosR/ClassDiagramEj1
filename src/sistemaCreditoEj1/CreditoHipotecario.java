package sistemaCreditoEj1;

public class CreditoHipotecario extends Credito{
    Propiedad garantia;

    public CreditoHipotecario(SolicitudCredito creditoAsociado, Propiedad garantia) {
        super(creditoAsociado);
        this.garantia = garantia;
    }

    public Object getPropiedad(){
        return this.garantia;
    }
}
