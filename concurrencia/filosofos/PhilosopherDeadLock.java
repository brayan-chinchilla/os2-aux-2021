
import java.awt.Color;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** @author franklinvelasquezfuentes
 */
public class PhilosopherDeadLock  extends Thread {
    
    protected ChopstickDeadLock leftChopstick;
    protected ChopstickDeadLock rightChopstick;
    protected JLabel lbPhilosopher;
    protected JLabel lbLeftHand;
    protected JLabel lbRightHand;

    public PhilosopherDeadLock(ChopstickDeadLock leftChopstick, ChopstickDeadLock rightChopstick, JLabel lbPhilosopher, JLabel lbLeftHand, JLabel lbRightHand) {
        this.leftChopstick = leftChopstick;
        this.rightChopstick = rightChopstick;
        this.lbPhilosopher = lbPhilosopher;
        this.lbLeftHand = lbLeftHand;
        this.lbRightHand = lbRightHand;
    }
    
    public void pensar(){
        this.lbPhilosopher.setBorder(BorderFactory.createLineBorder(Color.black,5));
        try{
            Random random = new Random();
            int random_time = random.nextInt(10);
            Thread.sleep(random_time);
        }catch(Exception e){
        }
    }

    public void levantarPalillos(){
        leftChopstick.levantar(lbLeftHand);
        rightChopstick.levantar(lbRightHand);
    }

    public void bajarPalillos(){
        leftChopstick.bajar(lbLeftHand);
        rightChopstick.bajar(lbRightHand);
    }

    public void comer(){
        levantarPalillos();
        this.lbPhilosopher.setBorder(BorderFactory.createLineBorder(Color.blue,5));

        try{
            Random random = new Random();
            int random_time = random.nextInt(10);
            Thread.sleep(random_time);
        }catch(Exception e){
        }

        bajarPalillos();
        this.lbPhilosopher.setBorder(BorderFactory.createLineBorder(Color.black,5));
    }
    
    @Override
    public void run() {
        //TODO exist
        while(true){
            pensar();
            comer();
        }
    }
    
    

}
