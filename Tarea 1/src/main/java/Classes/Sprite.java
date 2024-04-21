package Classes;
import Classes.Bebida;

/**
 *
 */
public class Sprite extends Bebida {
    /**
     *
     * @param serie
     */
    public Sprite(int serie){
        super(serie);
    }

    /**
     *
     * @return
     */
    @Override
    public String comer(){
        return "Sprite";
    }
}
