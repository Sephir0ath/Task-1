package org.example;

import Classes.*;
import Excepciones.*;

public class Main {
    public static void main(String[] args) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Moneda mon = new Moneda1500();
        Expendedor exp = new Expendedor(0);

        // Caso error 1
        try {
            Comprador com = new Comprador(mon, Productos.COCA, exp);
        }
        catch (Exception error) {
            System.out.println("ERROR: No hay productos en el deposito (" + error + ")");
        }

        // Caso error 2
        mon = null;
        exp = new Expendedor(2);

        try {
            Comprador com = new Comprador(mon, Productos.SNICKERS, exp);
        }
        catch (Exception error) {
            System.out.println("ERROR: No haz ingresado una moneda (" + error + ")");
        }

        // Caso error 3
        exp = new Expendedor(2);
        mon = new Moneda100();

        try {
            Comprador com = new Comprador(mon, Productos.SUPER8, exp);
        }
        catch (Exception error) {
            System.out.println("ERROR: No ingresaste suficiente dinero (" + error + ")");


        // Casos de prueba que funcionan
        // Caso 1: Snickers - Valor snickers: 600
        mon = new Moneda1500();
        exp = new Expendedor(2);
        Comprador com = new Comprador(mon, Productos.SNICKERS, exp);


        System.out.println("He comido: " + com.queComiste() + " y mi vuelto es: " + com.cuantoVuelto());

        // Caso 2: Fanta - Valor fanta: 700
        mon = new Moneda1000();
            exp = new Expendedor(2);
        com = new Comprador(mon, Productos.FANTA, exp);


        System.out.println("He comido: " + com.queComiste() + " y mi vuelto es: " + com.cuantoVuelto());

        }
    }

}