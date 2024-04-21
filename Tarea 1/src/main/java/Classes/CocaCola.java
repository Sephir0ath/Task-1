package Classes;

/**
 * CocaCola Subclase de Bebida
 */
public class CocaCola extends Bebida {
    /**
     *
     * @param serie Recibe el numero de serie del producto
     */
    public CocaCola(int serie){
        super(serie);
    }

    /**
     *
     * @return Retorna "CocaCola" al ser tomada, correspondiente a la marca de la Bebida
     */
    @Override
    public String comer(){
        return "CocaCola";
    }
}
