/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productorconsumidor;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author chinchilla
 */
public class ResourceList {
    
    LinkedList<Integer> lista = new LinkedList<Integer>();
    int maxSize;
    
    ReentrantLock lock = new ReentrantLock();
    Condition notFull = lock.newCondition();
    Condition notEmpty = lock.newCondition();
    
    public ResourceList(int maxSize){
        this.maxSize = maxSize;
    }
    
    public int add(){
        int i = -1;
        try{
            this.lock.lock();
            while(this.lista.size() == maxSize){
                System.out.println("Producer waiting");
                this.notFull.await();
            }
            i = this.lista.size() + 1;
            this.lista.add(i);
            this.notEmpty.signalAll();
        }catch(Exception e){
            
        }finally{
            this.lock.unlock();
            return i;
        }      
    }
    
    public int get(){
        int i = -1;
        try{
            this.lock.lock();
            while(this.lista.size() == 0){
                System.out.println("Consumer waiting");
                this.notEmpty.await();
            }
            i = this.lista.removeLast();
            this.notFull.signalAll();
            
        }catch(Exception e){
            
        }finally{
            this.lock.unlock();
            return i;
        } 
    }
}
