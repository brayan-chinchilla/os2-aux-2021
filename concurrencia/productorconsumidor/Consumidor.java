/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productorconsumidor;

/**
 *
 * @author chinchilla
 */
public class Consumidor extends Thread{
    
    public ResourceList resourceList;
    
    public Consumidor(ResourceList resourceList){
        this.resourceList = resourceList;
    }
    
    public void consumir() throws InterruptedException{
        Thread.sleep(1000);
        int i = resourceList.get();
        System.out.println("Consumed: " + i);
    }
    
    @Override
    public void run(){
        while (true)
        {
           try
           {
              consumir();
           } 
           catch (InterruptedException ex)
           {
              ex.printStackTrace();
           }
        }
    }
    
}
