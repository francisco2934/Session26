package main.java.mx.utng.s31

public class Ejercicio1 {

    private final StringToInteger parser = new StringToInteger(){
        @Override
        public Integer convertir(String s){
            return Integer.parseInt(s);
        } 
    };
    

    Integer sumar(String a, String b){
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}
