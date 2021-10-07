package clase5;

import java.util.concurrent.locks.ReentrantLock;

public class Contador {

    private int cuenta;

    private ReentrantLock candado;

    public Contador(){

        this.cuenta = 0;
        this.candado = new ReentrantLock();
    }

    public void aumentar(){
        this.candado.lock();
        //entra region critica
        this.cuenta = this.cuenta + 1;
        //sale region critica
        this.candado.unlock();

        /*
        Hilo A
        Codigo 3D

        t1 = p + 0;
        t2 = heap[t1]; //lectura de cuenta, lee que cuenta=50
        t3 = t2 + 1;
        ****cambio de contexto
        t1 = p + 0;
        heap[t1] = t3;  //escritura de cuenta, escribe que cuenta=51
         */

        /*
        Hilo B
        Codigo 3D

        --bloqueada--
        t1 = p + 0;
        t2 = heap[t1]; //lectura de cuenta, lee que cuenta=50
        t3 = t2 + 1;
        t1 = p + 0;
        heap[t1] = t3;  //escritura de cuenta, escribe que cuenta=51
        ******
         */
    }

    public int getCuenta(){
        return this.cuenta;
    }
}
