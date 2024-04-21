package Classes;

/**
 *
 */
public abstract class Dulce extends Producto {
    /**
     *
     * @param serie
     */
    public Dulce(int serie) {
        super(serie);
    }

    /**
     *
     * @return
     */
    public int getSerie() {
        return super.getSerie();
    }

    /**
     *
     * @return
     */
    public abstract String comer();
}