
import java.awt.Color;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** @author franklinvelasquezfuentes
 */

//TODO sync shared resource
public class ChopstickDeadLock {
    // Clase del Palillo = Chopstick
    
    protected JLabel lbChopstick;
    protected ReentrantLock candado = new ReentrantLock();

    public ChopstickDeadLock(JLabel lbChopstick) {
        this.lbChopstick = lbChopstick;
    }
    
    public void levantar(JLabel lbHand){
        this.candado.lock();
        this.lbChopstick.setBorder(BorderFactory.createLineBorder(Color.red,1));
        lbHand.setForeground(Color.red);
    }
    
    
    public void bajar(JLabel lbHand){
        this.lbChopstick.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lbHand.setForeground(Color.black);
        this.candado.unlock();
    }

    public boolean puedeLevantar(JLabel lbLeftHand) {
        return true;
    }
}
