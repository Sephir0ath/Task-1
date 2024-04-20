package Classes;

import Classes.Bebida;
public class Sprite extends Bebida {
    public Sprite(int serie){
        super(serie);
    }
    @Override
public String comer(){
    return "Sprite";
}
}
