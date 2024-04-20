package Classes;
import java.util.ArrayList;

public class Deposito<T> {
    ArrayList<T> deposito;

    public Deposito(){
        deposito = new ArrayList<>();
    }

    public T get(){
        if (deposito.isEmpty()){
            return null;
        }

        T objetoQueSeRetorna = deposito.get(0);
        deposito.remove(0);
        return objetoQueSeRetorna;
    }

    public ArrayList<T> returnArrayList(){
        return deposito;
    }

    public void add(T objeto){
        deposito.add(objeto);
    }

}
