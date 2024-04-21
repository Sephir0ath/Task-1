package Classes;

/**
 *
 */
public class CocaCola extends Bebida {
    /**
     *
     * @param serie
     */
    public CocaCola(int serie){
        super(serie);
    }

    /**
     *
     * @return
     */
    @Override
    public String comer(){
        return "CocaCola";
    }
}
