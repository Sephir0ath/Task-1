package Classes;
import java.util.ArrayList;

/**
 *
 * @param <T>
 */
public class Deposito<T> {
    ArrayList<T> deposito;

    /**
     *
     */
    public Deposito(){
        deposito = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public T get(){
        if (deposito.isEmpty()){
            return null;
        }

        T objetoQueSeRetorna = deposito.get(0);
        deposito.remove(0);
        return objetoQueSeRetorna;
    }

    /**
     *
     * @return
     */
    public ArrayList<T> returnArrayList(){
        return deposito;
    }

    /**
     *
     * @param objeto
     */
    public void add(T objeto){
        deposito.add(objeto);
    }

}
