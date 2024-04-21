package Classes;

/**
 *
 */
public abstract class Producto {
    private int serie;

    /**
     *
     * @param serie
     */
    public Producto(int serie){
        this.serie = serie;
    }

    /**
     *
     * @return
     */
    public int getSerie(){
        return serie;
    }

    /**
     *
     * @return
     */
    public abstract String comer();
}
