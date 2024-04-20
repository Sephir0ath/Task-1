package Classes;

public class CocaCola extends Bebida {
    public CocaCola(int serie){
        super(serie);
    }
    
    @Override
    public String comer(){
        return "CocaCola";
    }
}
