package Classes;

public abstract class Dulce extends Producto {
    public Dulce(int serie) {
        super(serie);
    }

    public int getSerie() {
        return super.getSerie();
    }

    public abstract String comer();
}