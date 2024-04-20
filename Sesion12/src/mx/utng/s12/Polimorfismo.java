package mx.utng.s12;

import java.util.Scanner;

public class Polimorfismo {
    public static void main(String[] args) {
        //Clear un odjeto v de la clase Venado
        Venado v = new Venado();

        Animal a = v;

        Hervivoro h = v;

        Object o = v;

        //Scanner s = v;

        System.out.println("Venado: "+ (v instanceof Venado));
        System.out.println("Animal: "+ (a instanceof Animal));
        System.out.println("Hervivoro: "+ (h instanceof Hervivoro));            
        System.out.println("Odject: "+ (o instanceof Odject));                     
        //System.out.println("Scanner: "+ (v instanceof Scanner));     

        v.comer();

        Humano humano = new Humano();
        humano.comer();
    }
}
