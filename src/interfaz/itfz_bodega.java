package interfaz;
import clases_tr.Pruebas_listas;
import java.awt.Dimension;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class itfz_bodega extends javax.swing.JFrame {
    Pruebas_listas ls = new Pruebas_listas(); //<- Se instancia la clase listas 
    DefaultListModel Jlistita = new DefaultListModel();
    public itfz_bodega() {
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
       this.Jlist_bodega.setVisible(false);
       this.L_txt_cajasenbodega.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        L_txt_cajasenbodega = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Jlist_bodega = new javax.swing.JList<>();
        btn_verbodega = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cabecera_bodega.jpg"))); // NOI18N

        L_txt_cajasenbodega.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        L_txt_cajasenbodega.setText("Cajas en Bodega:");

        Jlist_bodega.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(Jlist_bodega);

        btn_verbodega.setText("Ver Bodega");
        btn_verbodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verbodegaActionPerformed(evt);
            }
        });

        btn_home.setIcon(new javax.swing.ImageIcon("C:\\Users\\Carlos Peñaranda\\Pictures\\Png's\\logo_inicio.png")); // NOI18N
        btn_home.setBorderPainted(false);
        btn_home.setContentAreaFilled(false);
        btn_home.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_inicio_1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_verbodega, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(L_txt_cajasenbodega, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(L_txt_cajasenbodega, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_verbodega))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_home)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_verbodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verbodegaActionPerformed
        this.Jlist_bodega.setVisible(true);
        this.L_txt_cajasenbodega.setVisible(true);
        //Se deben imprimir los diferentes objetos caja_producto en la lista, se selecciona el indice y se puede acceder a su informacion
  
                
        //list_model.getCajas_productos();

    }//GEN-LAST:event_btn_verbodegaActionPerformed

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
            java.util.logging.Logger.getLogger(itfz_bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(itfz_bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(itfz_bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(itfz_bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new itfz_bodega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Jlist_bodega;
    private javax.swing.JLabel L_txt_cajasenbodega;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_verbodega;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
