
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franklinvelasquezfuentes
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        
        PhilosopherMejorado [] philosophers = new PhilosopherMejorado[5];
        ChopstickMejorado [] chopsticks = new ChopstickMejorado[5];
        
        JLabel [] labels_philosophers = new JLabel[5];
        JLabel [] labels_left_hands = new JLabel[5];
        JLabel [] labels_right_hands = new JLabel[5];
        JLabel [] labels_chopsticks = new JLabel[5];
        
        labels_left_hands[0] = lbPhilo1Left;
        labels_left_hands[1] = lbPhilo2Left1;
        labels_left_hands[2] = lbPhilo3Left;
        labels_left_hands[3] = lbPhilo4Left;
        labels_left_hands[4] = lbPhilo5Left;
        
        labels_right_hands[0] = lbPhilo1Right;
        labels_right_hands[1] = lbPhilo2Right;
        labels_right_hands[2] = lbPhilo3Right;
        labels_right_hands[3] = lbPhilo4Right;
        labels_right_hands[4] = lbPhilo5Right;

        
        labels_philosophers[0] = lbPhilosopher1;
        labels_philosophers[1] = lbPhilosopher2;
        labels_philosophers[2] = lbPhilosopher3;
        labels_philosophers[3] = lbPhilosopher4;
        labels_philosophers[4] = lbPhilosopher5;
        
        labels_chopsticks[0] = lbChopstick1 ;
        labels_chopsticks[1] = lbChopstick2 ;
        labels_chopsticks[2] = lbChopstick3;
        labels_chopsticks[3] = lbChopstick4;
        labels_chopsticks[4] = lbChopstick5;
        
        for (int i = 0; i < labels_chopsticks.length; i++) {
            chopsticks[i] = new ChopstickMejorado(labels_chopsticks[0]);
        }
        
        philosophers[0] = new PhilosopherMejorado(chopsticks[4], chopsticks[0],labels_philosophers[0],labels_left_hands[0],labels_right_hands[0]);
        
        for (int i = 1 ; i < philosophers.length; i++) {
            philosophers[i] = new PhilosopherMejorado(chopsticks[i-1], chopsticks[i],labels_philosophers[i],labels_left_hands[i],labels_right_hands[i]);
        }
        
        Solucion solucion = new Solucion(philosophers);
        solucion.iniciarSimulacion();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPhilosopher1 = new javax.swing.JLabel();
        lbPhilosopher2 = new javax.swing.JLabel();
        lbPhilosopher3 = new javax.swing.JLabel();
        lbPhilosopher4 = new javax.swing.JLabel();
        lbPhilosopher5 = new javax.swing.JLabel();
        lbChopstick1 = new javax.swing.JLabel();
        lbChopstick2 = new javax.swing.JLabel();
        lbChopstick3 = new javax.swing.JLabel();
        lbChopstick4 = new javax.swing.JLabel();
        lbChopstick5 = new javax.swing.JLabel();
        lbPhilo3Left = new javax.swing.JLabel();
        lbPhilo2Right = new javax.swing.JLabel();
        lbPhilo2Left1 = new javax.swing.JLabel();
        lbPhilo3Right = new javax.swing.JLabel();
        lbPhilo4Right = new javax.swing.JLabel();
        lbPhilo4Left = new javax.swing.JLabel();
        lbPhilo5Left = new javax.swing.JLabel();
        lbPhilo5Right = new javax.swing.JLabel();
        lbPhilo1Left = new javax.swing.JLabel();
        lbPhilo1Right = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbPhilosopher1.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        lbPhilosopher1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/democrito.jpg"))); // NOI18N
        lbPhilosopher1.setMaximumSize(new java.awt.Dimension(197, 215));
        lbPhilosopher1.setMinimumSize(new java.awt.Dimension(197, 215));
        lbPhilosopher1.setPreferredSize(new java.awt.Dimension(197, 215));

        lbPhilosopher2.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        lbPhilosopher2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/descartes.jpg"))); // NOI18N

        lbPhilosopher3.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        lbPhilosopher3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kant.jpg"))); // NOI18N

        lbPhilosopher4.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        lbPhilosopher4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/platon.jpg"))); // NOI18N

        lbPhilosopher5.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        lbPhilosopher5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/socrates.jpg"))); // NOI18N

        lbChopstick1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chopstick_left.jpg"))); // NOI18N

        lbChopstick2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chopstick_left.jpg"))); // NOI18N

        lbChopstick3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chopstick_vertical.jpg"))); // NOI18N

        lbChopstick4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chopstick_right.jpg"))); // NOI18N

        lbChopstick5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chopstick_right.jpg"))); // NOI18N

        lbPhilo3Left.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lbPhilo3Left.setText("   |   ");

        lbPhilo2Right.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lbPhilo2Right.setText("   |   ");

        lbPhilo2Left1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lbPhilo2Left1.setText("   |   ");

        lbPhilo3Right.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lbPhilo3Right.setText("   |   ");

        lbPhilo4Right.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lbPhilo4Right.setText("   |   ");

        lbPhilo4Left.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lbPhilo4Left.setText("   |   ");

        lbPhilo5Left.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lbPhilo5Left.setText("   |   ");

        lbPhilo5Right.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lbPhilo5Right.setText("   |   ");

        lbPhilo1Left.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lbPhilo1Left.setText("   |   ");

        lbPhilo1Right.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lbPhilo1Right.setText("   |   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(212, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPhilosopher5)
                            .addComponent(lbPhilo5Left)
                            .addComponent(lbPhilo5Right))
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbPhilosopher3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(lbPhilosopher4)
                        .addGap(211, 211, 211))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbChopstick1)
                            .addComponent(lbPhilo3Right))
                        .addGap(40, 40, 40)
                        .addComponent(lbChopstick3)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbChopstick4)
                                .addGap(138, 138, 138))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbPhilo4Left)
                                .addGap(73, 73, 73)
                                .addComponent(lbPhilo4Right)
                                .addGap(180, 180, 180))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbPhilo2Right)
                                .addComponent(lbPhilosopher2)
                                .addComponent(lbPhilo2Left1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbPhilo3Left)
                                    .addComponent(lbChopstick2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(lbPhilo1Right)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPhilosopher1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbChopstick5)
                            .addComponent(lbPhilo1Left))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbPhilosopher1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPhilo1Left)
                            .addComponent(lbPhilo1Right))
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lbChopstick1))
                    .addComponent(lbChopstick5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbPhilo5Right)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPhilosopher5)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbPhilo2Left1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPhilosopher2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPhilo5Left)
                    .addComponent(lbPhilo2Right))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbChopstick4)
                            .addComponent(lbChopstick2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbPhilo3Right, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbPhilo3Left)
                                .addComponent(lbPhilo4Left)
                                .addComponent(lbPhilo4Right))
                            .addComponent(lbChopstick3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPhilosopher3)
                    .addComponent(lbPhilosopher4))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true); 
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbChopstick1;
    private javax.swing.JLabel lbChopstick2;
    private javax.swing.JLabel lbChopstick3;
    private javax.swing.JLabel lbChopstick4;
    private javax.swing.JLabel lbChopstick5;
    private javax.swing.JLabel lbPhilo1Left;
    private javax.swing.JLabel lbPhilo1Right;
    private javax.swing.JLabel lbPhilo2Left1;
    private javax.swing.JLabel lbPhilo2Right;
    private javax.swing.JLabel lbPhilo3Left;
    private javax.swing.JLabel lbPhilo3Right;
    private javax.swing.JLabel lbPhilo4Left;
    private javax.swing.JLabel lbPhilo4Right;
    private javax.swing.JLabel lbPhilo5Left;
    private javax.swing.JLabel lbPhilo5Right;
    private javax.swing.JLabel lbPhilosopher1;
    private javax.swing.JLabel lbPhilosopher2;
    private javax.swing.JLabel lbPhilosopher3;
    private javax.swing.JLabel lbPhilosopher4;
    private javax.swing.JLabel lbPhilosopher5;
    // End of variables declaration//GEN-END:variables
}