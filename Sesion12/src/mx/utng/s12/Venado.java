package mx.utng.s12;

public class Venado extends Animal implements Hervivoro{
    
    @Override
    public void comer() {
        System.out.println("Pasto");
    }
}
