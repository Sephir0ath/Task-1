package Classes;

/**
 *Bebida Subclase de Producto de tipo abstracta, sirve de base para las diferentes marcas de Bebidas
 */
public abstract class Bebida extends Producto{
    /**
     *
     * @param serie Recibe el numero de serie del producto
     */
    public Bebida(int serie){
        super(serie);
    }

    /**
     *
     * @return Retorna el numero de serie del producto
     */
    public int getSerie(){
        return super.getSerie();
    }

    /**
     *
     * @return Retorna un String con el nombre del producto al ser usado
     */
    public abstract String comer();
}
