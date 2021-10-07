
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** @author franklinvelasquezfuentes
 */
public  class Solucion {
    
    private PhilosopherDeadLock []  philosophers_array;

    public Solucion(PhilosopherDeadLock[] philosophers_array) {
        this.philosophers_array = philosophers_array;
    }
    
    public void iniciarSimulacion(){
        for (int i = 0; i < philosophers_array.length; i++) {
            philosophers_array[i].start();
        }
    }

}
