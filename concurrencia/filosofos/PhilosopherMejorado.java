
import java.awt.Color;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** @author franklinvelasquezfuentes
 */
public class PhilosopherMejorado extends PhilosopherDeadLock {
    
    public PhilosopherMejorado(ChopstickMejorado leftChopstick, ChopstickMejorado rightChopstcik, JLabel lbPhilosopher, JLabel lbLeftHand, JLabel lbRightHand) {
        super( leftChopstick,  rightChopstcik,  lbPhilosopher,  lbLeftHand,  lbRightHand) ;
    }

    public boolean puede_levantar_palillos(){
        if(!this.leftChopstick.puedeLevantar(lbLeftHand)){
            return false;
        }
        //aca ya levanto el izquierdo
        if(!this.rightChopstick.puedeLevantar(lbRightHand)){

            leftChopstick.bajar(lbLeftHand);
            return false;
        }
        //aca ya levanto el derecho
        return true;
    }

    public void comer(){
        if(puede_levantar_palillos()){
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
    }

}
