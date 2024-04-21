package Classes;

/**
 * Producto Clase de tipo abstracta, sirve de base para Productos como Dulces y Bebidas
 */
public abstract class Producto {
    private int serie;

    /**
     *
     * @param serie Recibe el numero de serie del producto
     */
    public Producto(int serie){
        this.serie = serie;
    }

    /**
     *
     * @return serie Retorna el numero de serie del producto
     */
    public int getSerie(){
        return serie;
    }

    /**
     *
     * @return Retorna un String con el nombre del producto al ser usado
     */
    public abstract String comer();
}
