package Classes;
import Classes.Bebida;

/**
 * Fanta Subclase de Bebida
 */
public class Fanta extends Bebida {
    /**
     *
     * @param serie Recibe el numero de serie del producto
     */
    public Fanta(int serie){
        super(serie);
    }

    /**
     *
     * @return Retorna "Fanta" al ser tomada, correspondiente a la marca de la Bebida
     */
    @Override
    public String comer(){
        return "Fanta";
    }
}
