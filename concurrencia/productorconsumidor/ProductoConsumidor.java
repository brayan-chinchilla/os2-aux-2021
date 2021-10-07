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
public class ProductoConsumidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ResourceList resourceList = new ResourceList(5);
        Productor productorA = new Productor(resourceList);
        Productor productorB = new Productor(resourceList);
        Consumidor consumidorA = new Consumidor(resourceList);
        Consumidor consumidorB = new Consumidor(resourceList);        
        productorA.start();
        consumidorA.start();
        //productorB.start();
        consumidorB.start();
    }
    
}
