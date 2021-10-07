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
public class Productor extends Thread {
    
    public ResourceList resourceList;
    
    public Productor(ResourceList resourceList){
        this.resourceList = resourceList;
    }
    
    public void producir() throws InterruptedException{
        Thread.sleep(1000);
        int i = resourceList.add();
        System.out.println("Produced: " + i);
    }
    
    @Override
    public void run(){
        while (true)
        {
           try
           {
              producir();
           } 
           catch (InterruptedException ex)
           {
              ex.printStackTrace();
           }
        }
    }
    
    
}
