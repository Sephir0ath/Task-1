package Classes;

import Excepciones.NoHayProductoException;
import Excepciones.PagoIncorrectoException;
import Excepciones.PagoInsuficienteException;

public class Comprador {
    private String sonido;
    private int vuelto;
    public Comprador(Moneda moneda, Productos cualProducto, Expendedor expendedor) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        sonido = expendedor.comprarProducto(moneda, cualProducto).comer();
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
