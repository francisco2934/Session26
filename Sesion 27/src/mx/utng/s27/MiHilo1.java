package mx.utng.s27;

import java.util.concurrent.TimeUnit;

public class MiHilo1 extends Thread {
    @Override
    public void run() {
        for (int 1 = 0; 1 <= 10; 1++ ){
            System.out.println("Hilo 1: "+1);
            try {
                TimeUnit.SECONDS.sleep(1);
            }  
        }
    }
}
