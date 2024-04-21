package Classes;

/**
 *
 */
public abstract class Bebida extends Producto{
    /**
     *
     * @param serie
     */
    public Bebida(int serie){
        super(serie);
    }

    /**
     *
     * @return
     */
    public int getSerie(){
        return super.getSerie();
    }

    /**
     *
     * @return
     */
    public abstract String comer();
}
