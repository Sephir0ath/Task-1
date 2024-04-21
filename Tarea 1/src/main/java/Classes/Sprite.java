package Classes;
import Classes.Bebida;

/**
 * Sprite Subclase de Bebida
 */
public class Sprite extends Bebida {
    /**
     *
     * @param serie Recibe el numero de serie del producto
     */
    public Sprite(int serie){
        super(serie);
    }

    /**
     *
     * @return Retorna "Sprite" al ser tomada, correspondiente a la marca de la Bebida
     */
    @Override
    public String comer(){
        return "Sprite";
    }
}
