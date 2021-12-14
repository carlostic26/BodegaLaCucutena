package interfaz;
import clases_tr.ProcesandoIngresos;
import clases_tr.Pruebas_listas;
import interfaz.itfz_ingresp;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class itfz_estant extends javax.swing.JFrame {
    ProcesandoIngresos list_model = new ProcesandoIngresos();
    public itfz_estant() {
        initComponents();
        this.setMinimumSize(new Dimension(414, 410)); 
       this.setLocationRelativeTo(null);
       setResizable(false); //<- Impedimos que la ventana pueda estirarse o cambiar de tamaño
        setIconImage(new ImageIcon(getClass().getResource("/img/Escudo_Unilibre3.png")).getImage()); //<- Estableciendo icono de ventana
            ((JPanel)getContentPane()).setOpaque(false);
            ImageIcon uno=new ImageIcon(this.getClass().getResource("/img/fondo_supermarket.jpg"));
            JLabel fondo= new JLabel();
            fondo.setIcon(uno);
            getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
            fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        setTitle("Productos en Estanteria - Supermercado La Cucuteña"); //<- Texto de ventana     
       this.Jlist_caduc.setVisible(false);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_home = new javax.swing.JButton();
        btn_ver_productos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jlist_caduc = new javax.swing.JList<>();
        Label_FechaSacar = new javax.swing.JLabel();
        jDate_fechaEstant = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Carlos Peñaranda\\Pictures\\Png's\\CAB_ESTANT.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 11, 410, 53);

        btn_home.setIcon(new javax.swing.ImageIcon("C:\\Users\\Carlos Peñaranda\\Pictures\\Png's\\logo_inicio.png")); // NOI18N
        btn_home.setBorderPainted(false);
        btn_home.setContentAreaFilled(false);
        btn_home.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_inicio_1.png"))); // NOI18N
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_home);
        btn_home.setBounds(350, 330, 41, 35);

        btn_ver_productos.setText("Ver productos ");
        btn_ver_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ver_productosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ver_productos);
        btn_ver_productos.setBounds(10, 330, 103, 23);

        Jlist_caduc.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Jlist_caduc);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 140, 280, 180);

        Label_FechaSacar.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        Label_FechaSacar.setText("Fecha De Estanteria");
        getContentPane().add(Label_FechaSacar);
        Label_FechaSacar.setBounds(10, 85, 117, 40);
        getContentPane().add(jDate_fechaEstant);
        jDate_fechaEstant.setBounds(130, 90, 160, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
       itfz_inicio in = new itfz_inicio();
       in.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_ver_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ver_productosActionPerformed
     // Se imprimira una cola, productos con fecha de caduc de la mas cercana a las lejana
     this.Jlist_caduc.setVisible(true);  

    }//GEN-LAST:event_btn_ver_productosActionPerformed

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
            java.util.logging.Logger.getLogger(itfz_estant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(itfz_estant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(itfz_estant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(itfz_estant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new itfz_estant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Jlist_caduc;
    private javax.swing.JLabel Label_FechaSacar;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_ver_productos;
    private com.toedter.calendar.JDateChooser jDate_fechaEstant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
