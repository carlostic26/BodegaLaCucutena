package interfaz;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class itfz_pedidos extends javax.swing.JFrame {

    public itfz_pedidos() {
        initComponents();
        this.setMinimumSize(new Dimension(393, 316)); 
       this.setLocationRelativeTo(null);
       setResizable(false); //<- Impedimos que la ventana pueda estirarse o cambiar de tamaño
        setIconImage(new ImageIcon(getClass().getResource("/img/Escudo_Unilibre3.png")).getImage()); //<- Estableciendo icono de ventana
            ((JPanel)getContentPane()).setOpaque(false);
            ImageIcon uno=new ImageIcon(this.getClass().getResource("/img/fondo_supermarket.jpg"));
            JLabel fondo= new JLabel();
            fondo.setIcon(uno);
            getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
            fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        setTitle("Realizar Pedido - Supermercado La Cucuteña"); //<- Texto de ventana           
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btt_inicio1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Carlos Peñaranda\\Pictures\\Png's\\cabecera_pedidos.png")); // NOI18N

        btt_inicio1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Carlos Peñaranda\\Pictures\\Png's\\logo_inicio.png")); // NOI18N
        btt_inicio1.setBorderPainted(false);
        btt_inicio1.setContentAreaFilled(false);
        btt_inicio1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_inicio_1.png"))); // NOI18N
        btt_inicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_inicio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btt_inicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                .addComponent(btt_inicio1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_inicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_inicio1ActionPerformed
        itfz_inicio in = new itfz_inicio();
        in.setVisible(true);
        this.setVisible(false);           
    }//GEN-LAST:event_btt_inicio1ActionPerformed

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
            java.util.logging.Logger.getLogger(itfz_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(itfz_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(itfz_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(itfz_pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new itfz_pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_inicio1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
