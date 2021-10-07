
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** @author franklinvelasquezfuentes
 */
public class ChopstickMejorado extends ChopstickDeadLock{

    public ChopstickMejorado(JLabel lbChopstick) {
        super(lbChopstick);
    }

    public boolean puedeLevantar(JLabel lblHand){
        boolean pudo_levantar = candado.tryLock();
        if(pudo_levantar){
            this.lbChopstick.setBorder(BorderFactory.createLineBorder(Color.red,1));
            lblHand.setForeground(Color.red);
        }
        return pudo_levantar;
    }

}
