/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Dospem;

/**
 *
 * @author tayoo
 */
public class TgsAkhir42 extends javax.swing.JFrame {

    /**
     * Creates new form TgsAkhir42
     */
    public TgsAkhir42() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Body = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        hdp = new javax.swing.JPanel();
        btnHdp = new javax.swing.JButton();
        mti = new javax.swing.JPanel();
        btnMti = new javax.swing.JButton();
        Light = new javax.swing.JPanel();
        Life = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Dead = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Body.setBackground(new java.awt.Color(204, 204, 204));

        Menu.setBackground(new java.awt.Color(204, 204, 204));
        Menu.setLayout(new java.awt.CardLayout());

        hdp.setBackground(new java.awt.Color(204, 204, 204));

        btnHdp.setBackground(new java.awt.Color(153, 255, 0));
        btnHdp.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        btnHdp.setForeground(new java.awt.Color(0, 0, 0));
        btnHdp.setText("NYALAKAN");
        btnHdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHdpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hdpLayout = new javax.swing.GroupLayout(hdp);
        hdp.setLayout(hdpLayout);
        hdpLayout.setHorizontalGroup(
            hdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hdpLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(btnHdp)
                .addGap(16, 16, 16))
        );
        hdpLayout.setVerticalGroup(
            hdpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hdpLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(btnHdp)
                .addGap(22, 22, 22))
        );

        Menu.add(hdp, "card2");

        mti.setBackground(new java.awt.Color(204, 204, 204));

        btnMti.setBackground(new java.awt.Color(204, 0, 0));
        btnMti.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        btnMti.setForeground(new java.awt.Color(0, 0, 0));
        btnMti.setText("MATIKAN");
        btnMti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMtiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mtiLayout = new javax.swing.GroupLayout(mti);
        mti.setLayout(mtiLayout);
        mtiLayout.setHorizontalGroup(
            mtiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mtiLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(btnMti)
                .addGap(24, 24, 24))
        );
        mtiLayout.setVerticalGroup(
            mtiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mtiLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(btnMti)
                .addGap(21, 21, 21))
        );

        Menu.add(mti, "card3");

        Light.setLayout(new java.awt.CardLayout());

        Life.setBackground(new java.awt.Color(204, 204, 204));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("LAMPU MATI");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel3)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LifeLayout = new javax.swing.GroupLayout(Life);
        Life.setLayout(LifeLayout);
        LifeLayout.setHorizontalGroup(
            LifeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LifeLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        LifeLayout.setVerticalGroup(
            LifeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LifeLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );

        Light.add(Life, "card2");

        Dead.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(153, 255, 51));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("LAMPU NYALA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DeadLayout = new javax.swing.GroupLayout(Dead);
        Dead.setLayout(DeadLayout);
        DeadLayout.setHorizontalGroup(
            DeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeadLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        DeadLayout.setVerticalGroup(
            DeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeadLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );

        Light.add(Dead, "card3");

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(Light, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Light, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHdpActionPerformed
        Light.removeAll();
        Light.repaint();
        Light.revalidate();
        Light.add(Dead);
        Light.repaint();
        Light.revalidate();
        
        Menu.removeAll();
        Menu.add(mti);
        Menu.repaint();
        Menu.revalidate();
        
    }//GEN-LAST:event_btnHdpActionPerformed

    private void btnMtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMtiActionPerformed
        Light.removeAll();
        Light.repaint();
        Light.revalidate();
        Light.add(Life);
        Light.repaint();
        Light.revalidate();
        
        Menu.removeAll();
        Menu.add(hdp);
        Menu.repaint();
        Menu.revalidate();
    }//GEN-LAST:event_btnMtiActionPerformed

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
            java.util.logging.Logger.getLogger(TgsAkhir42.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TgsAkhir42.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TgsAkhir42.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TgsAkhir42.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TgsAkhir42().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Dead;
    private javax.swing.JPanel Life;
    private javax.swing.JPanel Light;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton btnHdp;
    private javax.swing.JButton btnMti;
    private javax.swing.JPanel hdp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel mti;
    // End of variables declaration//GEN-END:variables
}