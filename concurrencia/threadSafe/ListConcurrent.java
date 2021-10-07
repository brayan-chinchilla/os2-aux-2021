package threadSafe;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ListConcurrent extends LinkedList<Integer> {

    public ReentrantReadWriteLock candado = new ReentrantReadWriteLock();

    public synchronized void insertar(int item){
        this.add(item);
    }

    public void imprimir(){
        for(int i : this){
            System.out.println(i);
        }
    }

    public boolean encontrar(int i){
        this.candado.readLock().lock();
        try {
            return this.contains(i);
        }finally {
            this.candado.readLock().unlock();
        }

    }

}
