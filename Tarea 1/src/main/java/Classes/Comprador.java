package Classes;

public class Comprador {
    private String sonido;
    private int vuelto;
    public Comprador(Moneda moneda, Productos cualProducto, Expendedor){
        sonido = expendedor.comprarProducto(moneda, cualProducto);
        while(true) {
            Moneda monedaAObtener = expendedor.getVuelto();
            if (monedaAObtener == null){
                break;
            }
            vuelto += monedaAObtener.getValor();
        }
    }
    public int cuantoVuelto() {
        return vuelto;
    }
    public String queComiste() {
        return sonido;
    }
}
