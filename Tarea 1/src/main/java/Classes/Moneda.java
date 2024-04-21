package Classes;

/**
 *
 *
 */
public abstract class Moneda implements Comparable<Moneda>{
    /**
     *
     *
     */
    public Moneda(){}

    public Moneda getSerie(){
        return this;
    }

    /**
     *
     * @param moneda the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Moneda moneda) {
        if (this.getValor() == moneda.getValor()){
            return 1;
        }

        else {
            return 0;
        }
    }

    /**
     *
     * @return
     */
    public abstract int getValor();

}
