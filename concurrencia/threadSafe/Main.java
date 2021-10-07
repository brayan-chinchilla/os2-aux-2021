package threadSafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService insertExecutorService = Executors.newCachedThreadPool();

        ListConcurrent list = new ListConcurrent();

        for(int i = 0; i < 500; i++){
            insertExecutorService.execute(new Hilo(list, i, 0));
        }

        //hilo.join()
        insertExecutorService.shutdown();
        insertExecutorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        System.out.println("Tamano lista: " + list.size());



        //Inicia pool de busquedas

        ExecutorService buscarExecutorService = Executors.newCachedThreadPool();

        long startTime = System.nanoTime();
        for(int i = 0; i < 500; i++){
            buscarExecutorService.execute(new Hilo(list, i, 1));
        }

        //hilo.join()
        buscarExecutorService.shutdown();
        buscarExecutorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        long deltaTime = System.nanoTime() - startTime;

        System.out.println("Tiempo lectura: " + deltaTime/100000);

    }
}
