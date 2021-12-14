package interfaz;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class itfz_inicio extends javax.swing.JFrame {

    public itfz_inicio() {
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
       setTitle("Inicio - Supermercado La Cucuteña"); //<- Texto de ventana             
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_estant = new javax.swing.JButton();
        btn_pedidos = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_productos = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        btn_bodega = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Carlos Peñaranda\\Pictures\\Png's\\cab_inicio.png")); // NOI18N

        btn_estant.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        btn_estant.setText("Productos Estanteria");
        btn_estant.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estanticon.png"))); // NOI18N
        btn_estant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estantActionPerformed(evt);
            }
        });

        btn_pedidos.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        btn_pedidos.setText("Realizar Pedidos");
        btn_pedidos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_pedidos.png"))); // NOI18N
        btn_pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pedidosActionPerformed(evt);
            }
        });

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit_icon-icons.png"))); // NOI18N
        btn_salir.setBorderPainted(false);
        btn_salir.setContentAreaFilled(false);
        btn_salir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit_icon-icons_2.png"))); // NOI18N
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_productos.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        btn_productos.setText("Ingresar Productos");
        btn_productos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_ingresar.png"))); // NOI18N
        btn_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productosActionPerformed(evt);
            }
        });

        btn_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/navigation32.png"))); // NOI18N
        btn_atras.setBorderPainted(false);
        btn_atras.setContentAreaFilled(false);
        btn_atras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/navigation32_2.png"))); // NOI18N
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        btn_bodega.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        btn_bodega.setText("Bodega");
        btn_bodega.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bodegaicon.png"))); // NOI18N
        btn_bodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bodegaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_bodega, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_estant, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_estant, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_atras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_bodega, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_estantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estantActionPerformed
       itfz_estant in = new itfz_estant();
       in.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btn_estantActionPerformed

    private void btn_pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pedidosActionPerformed
       itfz_pedidos in = new itfz_pedidos();
       in.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btn_pedidosActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
     dispose(); 
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productosActionPerformed
       itfz_ingresp in = new itfz_ingresp();
       in.setVisible(true);
       this.setVisible(false);     
    }//GEN-LAST:event_btn_productosActionPerformed

    private void btn_bodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bodegaActionPerformed
      itfz_bodega in = new itfz_bodega();
      in.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btn_bodegaActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
      itf_1_principal in = new itf_1_principal();
      in.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btn_atrasActionPerformed

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
            java.util.logging.Logger.getLogger(itfz_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(itfz_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(itfz_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(itfz_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new itfz_inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_bodega;
    private javax.swing.JButton btn_estant;
    private javax.swing.JButton btn_pedidos;
    private javax.swing.JButton btn_productos;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
