package Classes;
import Classes.Bebida;

/**
 *
 */
public class Fanta extends Bebida {
    /**
     *
     * @param serie
     */
    public Fanta(int serie){
        super(serie);
    }

    /**
     *
     * @return
     */
    @Override
    public String comer(){
        return "Fanta";
    }
}
