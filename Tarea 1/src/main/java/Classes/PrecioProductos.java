package Classes;

/**
 *
 */
public enum PrecioProductos {
    VALORCOCACOLA(1000),
    VALORSPRITE(800),
    VALORFANTA(700),
    VALORSNICKERS(600),
    VALORSUPER8(200);

    private final int precio;

    /**
     *
     * @param precio
     */
    private PrecioProductos(int precio){
        this.precio = precio;
    }

    /**
     *
     * @return
     */
    public int getPrecio(){
       return precio;
    }

}
