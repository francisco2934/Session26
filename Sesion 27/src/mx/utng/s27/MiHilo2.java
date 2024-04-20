package mx.utng.s27;

import java.util.concurrent.TimeUnit;

public class MiHilo2 extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("Hilo 2 : Sigo en ejecucion");

            try {
                TimeUnit.MICROSECONDS.sleep();
            }
        }
    }
}
