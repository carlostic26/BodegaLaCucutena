package interfaz;
import clases_tr.*;
import clases_tr.Pruebas_listas;
import java.awt.Dimension;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class itfz_ingresp extends javax.swing.JFrame {
    //listas ls = new listas(); //<- Se instancia la clase listas 
    DefaultListModel modeloLista = new DefaultListModel();//<- para hacer uso en Jlist por ejemplo borrar dato, etc

    ProcesandoIngresos list_model_ingresos = new ProcesandoIngresos(); //<- Creando objeto de la clase ProcesandoObjetos, con ella se haran los procesos con los objetos, add, eliminar, etc
    boolean guardado;//<- este boolean será util al momento de verificar que el usuario haya guardado el registro datos antes de inciiar un nuevo 
    //ArrayList<cajas_productos> lista_cajas = new ArrayList<cajas_productos>();
   
    public itfz_ingresp() {
        initComponents();
         modeloLista=new DefaultListModel();
         jList_Ingreso2.setModel(modeloLista);
         jList_Ingreso2.setModel(list_model_ingresos);
         this.setMinimumSize(new Dimension(393, 316)); 
         this.setLocationRelativeTo(null);//<- que inicie ventana centrada
         setResizable(false); //<- Impedimos que la ventana pueda estirarse o cambiar de tamaño
         setIconImage(new ImageIcon(getClass().getResource("/img/Escudo_Unilibre3.png")).getImage()); //<- Estableciendo icono de ventana
         ((JPanel)getContentPane()).setOpaque(false);
         ImageIcon uno=new ImageIcon(this.getClass().getResource("/img/background_ingresoproductos.jpg"));//<- definiendo la img fondo
         JLabel fondo= new JLabel(); //<- definiendo objeto fondo
         fondo.setIcon(uno);//<- estableciendo imagen de fondo
         getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
         fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
         setTitle("Ingresar Caja - Supermercado La Cucuteña"); //<- Texto de ventana    
         this.btn_nuevo.setEnabled(false);
         this.btn_borrar.setEnabled(false);
         this.L_aviso_infoguardada.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Lcodigo_ref = new javax.swing.JTextField();
        btn_nuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Lstock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_home = new javax.swing.JButton();
        L_aviso_infoguardada = new javax.swing.JLabel();
        btn_aceptar_guardar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Lfecha_ingreso = new com.toedter.calendar.JDateChooser();
        Lfecha_caduc = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        Lnombre_producto = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList_Ingreso2 = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        Labelnombre = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Labelreferencia = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Labelfechaingreso = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Labelfechacaducidad = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LabelStock = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_nuevo.setText("Nuevo Ingreso");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Carlos Peñaranda\\Pictures\\Png's\\cabecera.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel1.setText("Fecha de ingreso:");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel3.setText("Codigo Referencia:");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel4.setText("Stock:");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel5.setText("Fecha de Caducidad:");

        btn_home.setIcon(new javax.swing.ImageIcon("C:\\Users\\Carlos Peñaranda\\Pictures\\Png's\\logo_inicio.png")); // NOI18N
        btn_home.setBorderPainted(false);
        btn_home.setContentAreaFilled(false);
        btn_home.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_inicio_1.png"))); // NOI18N
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        L_aviso_infoguardada.setText("La informacion ha sido guardada.");

        btn_aceptar_guardar.setText("Aceptar y Guardar");
        btn_aceptar_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptar_guardarActionPerformed(evt);
            }
        });

        btn_borrar.setText("Borrar");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel6.setText("Lista de Ingreso:");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel7.setText("Nombre:");

        jList_Ingreso2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "campo_Nombre", "campo_campo_Referencia", "campo_Fecha Ingreso", "campo_Fecha Caducidad", "campo_Stock", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList_Ingreso2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList_Ingreso2ValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jList_Ingreso2);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel8.setText("Nombre:");

        Labelnombre.setText("---------------------------------");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel9.setText("Codigo Referencia:");

        Labelreferencia.setText("---------------------------------");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel10.setText("Fecha de ingreso:");

        Labelfechaingreso.setText("---------------------------------");

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel12.setText("Fecha de Caducidad:");

        Labelfechacaducidad.setText("---------------------------------");

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel11.setText("Stock:");

        LabelStock.setText("---------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Labelreferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Labelfechaingreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Labelnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Labelfechacaducidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Lnombre_producto)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(Lcodigo_ref, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Lfecha_caduc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Lfecha_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lstock, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(L_aviso_infoguardada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(20, 20, 20))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_aceptar_guardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_borrar)
                        .addGap(13, 13, 13)
                        .addComponent(L_aviso_infoguardada, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Lnombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(Lcodigo_ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Lfecha_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lfecha_caduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_aceptar_guardar)
                            .addComponent(btn_nuevo))))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labelnombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Labelreferencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Labelfechaingreso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Labelfechacaducidad)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(LabelStock)))
                    .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        this.btn_aceptar_guardar.setEnabled(true); //<- Habilita boton aceptar y guardar
        if(guardado==false){
            JOptionPane.showMessageDialog(null, "Tenga en cuenta que para agregar un nuevo registro\nDebe haber guardado el anterior.");
        } 
        if(guardado==true){//<- Si la info se guardó, los campos estaran vacios para realizar un nuevo registro
            this.guardado = false;
            this.L_aviso_infoguardada.setVisible(false);
            this.Lnombre_producto.setText(null);
            this.Lcodigo_ref.setText(null);
            this.Lfecha_caduc.setDate(null);
            this.Lstock.setText(null);
            this.Lfecha_ingreso.setDate(null);            
        }
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
       itfz_inicio in = new itfz_inicio();
       in.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btn_homeActionPerformed

      
    private void btn_aceptar_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptar_guardarActionPerformed
      try {
            this.btn_nuevo.setEnabled(true);//<- habilita boton nuevo ingreso
            this.btn_borrar.setEnabled(true);//<- habilita boton borrar dato
            this.Lfecha_ingreso.setBackground(null);//<- quita color a fecha ingreso
            this.Lfecha_caduc.setBackground(null);//<- quita color a fecha caducidad
            //Capturando Datos------------------------------------------------------------------------------
            int ref_caja = Integer.parseInt(Lcodigo_ref.getText()); //<- crea variable y le guarda la info
            String stock = this.Lstock.getText();
            String nombre = this.Lnombre_producto.getText();
            //DEFINIENDO FECHA DE INGRESO    
              SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yy");//<- Se le da formato
              java.util.Date D_fecha_ingreso = Lfecha_ingreso.getDate();//<- fecha de ingreso de tipo Date
              String S_fecha_ingreso = formateador.format(D_fecha_ingreso);//<- fecha de ingreso de tipo String
            //DEFINIENDO FECHA DE CADUCIDAD   
              java.util.Date D_fecha_caducidad = Lfecha_caduc.getDate();//<- fecha de caducidad de tipo Date
              String S_fecha_caducidad = formateador.format(D_fecha_caducidad );//<- fecha de caducidad de tipo String
            //Finaliza Captura ------------------------------------------------------------------------------
            
            //CREANDO OBJETO Y ENVIANDO ARGUMENTOS  
            cajas_productos p = new cajas_productos(nombre, ref_caja, D_fecha_ingreso, D_fecha_caducidad, stock);
            

            //------------------VALIDACION DE ERRORES EN FECHAS--------------------------------------------------------------
            if(D_fecha_ingreso.before(D_fecha_caducidad)==true){ //<- si la fecha de ingreso de la caja esta antes que la de su caducidad, es lo normal, entra en la lista de proceso        
                //Entra todo
                //objeto entra a metodo "addCajas_productos" DE LA CLASE ProcesandoIngresos Y mostrando en Jlist el Objeto//
                list_model_ingresos.addCajas_productos(p);//<- Agrega objeto a lista y Muestra el objeto en Jlist  
                this.L_aviso_infoguardada.setVisible(true);//<- avisa en pantalla quela info ha sido guardada
                this.btn_aceptar_guardar.setEnabled(false); //<- Deshabilita boton aceptar para impedir que se creen objetos multiplicados
                this.guardado = true;//<- "guardado" ahora es verdadero 
                this.btn_nuevo.setEnabled(true); //<- Habilitar boton de nuevo registro         
             }      
            if(D_fecha_ingreso.equals(D_fecha_caducidad)==true){//<- si la fecha de ingreso es la misma que la de caducidad, se pregunta al usuario si la quiere guardarla o no
                int input = JOptionPane.showConfirmDialog(null, "La Caja del producto caduca hoy.\n "
                 + "¿Desea enviarla a Bodega de todos modos?");
                // si el usuario aprueba, se enviara a estanterias las dos fechas
                if(input == JOptionPane.YES_OPTION){                 
                   JOptionPane.showMessageDialog(null, "La Caja del producto ha sido enviada a Bodega");
                   //entra todo 
                   //objeto entra a metodo "addCajas_productos" DE LA CLASE ProcesandoIngresos Y mostrando en Jlist el Objeto//
                  list_model_ingresos.addCajas_productos(p);//<- Agrega objeto a lista y Muestra el objeto en Jlist
                  this.btn_aceptar_guardar.setEnabled(false); //<- Deshabilita boton aceptar para impedir que se creen objetos multiplicados
                  this.L_aviso_infoguardada.setVisible(true);//<- avisa en pantalla quela info ha sido guardada
                  this.guardado = true;//<- "guardado" ahora es verdadero 
                  this.btn_nuevo.setEnabled(true); //<- Habilitar boton de nuevo registro
                }
            }
            if(D_fecha_ingreso.after(D_fecha_caducidad)==true){//<- si la fecha de ingreso esta despues que la de caducidad, hay que avisar que esto no puede ocurrir
                JOptionPane.showMessageDialog(null, "Advertencia: La fecha de ingreso no puede estar despues de la Fecha de caducidad.\nPor favor, verifique los campos de fechas");
                //marcamos en rojo las areas de fechas para avisar que se debe corregir
                this.Lfecha_ingreso.setBackground(java.awt.Color.red);//<- pinta de rojo el JDateChooser para mostrar el error
                this.Lfecha_caduc.setBackground(java.awt.Color.red);//<- pinta de rojo el JDateChooser para mostrar el error
                this.btn_borrar.setEnabled(false);//<- deshabilita boton borrar
                this.btn_aceptar_guardar.setEnabled(true); //<- Habilita boton aceptar y guardar
                this.btn_nuevo.setEnabled(false); //<- deshabilita boton nuevo
            }         
            //---------------------OTRAS VALIDACIONES--------------------------------------------  
            

        } catch (ParseException ex) {
           JOptionPane.showMessageDialog(null, "Hubo un problema por favor verifique los datos");
        }         
  
    }//GEN-LAST:event_btn_aceptar_guardarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
     this.L_aviso_infoguardada.setVisible(false);//<- quita el aviso en pantalla de "la info ha sido guardada"
      int selection = jList_Ingreso2.getSelectedIndex();
      if (selection!=-1) {
         list_model_ingresos.eliminarCajas_producto(selection);
          //VALIDACION: si la lista llegare a estar vacia o se borran todos los objetos de las listas, abajo no aparecera nada
          if (jList_Ingreso2.isSelectionEmpty()) {
             Labelnombre.setText("---------------------------------");
             Labelreferencia.setText("---------------------------------");
             Labelfechaingreso.setText("---------------------------------");
             Labelfechacaducidad.setText("---------------------------------");
             LabelStock.setText("---------------------------------");
             this.btn_nuevo.setEnabled(false);
          } 
       } 
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void jList_Ingreso2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList_Ingreso2ValueChanged
      
       //DEFINIENDO String fechaI PARA PODER IMPRIMIR FECHAS DE LA FORMA dd/MM/AAAA
       //Debido a que no se encontro una forma de convertir la fecha completa a String se crearan tres variables, y se concardenaran para formar el string de fecha
       String dia = Integer.toString(Lfecha_ingreso.getCalendar().get(Calendar.DAY_OF_MONTH));
       String mes = Integer.toString(Lfecha_ingreso.getCalendar().get(Calendar.MONTH) + 1);
       String year = Integer.toString(Lfecha_ingreso.getCalendar().get(Calendar.YEAR));
       String fechaI = ( dia+ "/" + mes+ "/" +year ); //<- crea variable y le guarda la info

       //DEFINIENDO String fechaC PARA PODER IMPRIMIR FECHAS DE LA FORMA dd/MM/AAAA
       //Debido a que no se encontro una forma de convertir la fecha completa a String, se crearan tres variables, y se concardenaran para formar el string de fecha
       String diac = Integer.toString(Lfecha_caduc.getCalendar().get(Calendar.DAY_OF_MONTH));
       String mesc = Integer.toString(Lfecha_caduc.getCalendar().get(Calendar.MONTH) + 1);
       String yearc = Integer.toString(Lfecha_caduc.getCalendar().get(Calendar.YEAR));
       String fechaC = ( diac+ "/" + mesc+ "/" +yearc );//<- crea variable y le guarda la info   
        
     int selection = jList_Ingreso2.getSelectedIndex();
      if (selection!=-1) {
         cajas_productos p = list_model_ingresos.getCajas_productos(selection);
         Labelnombre.setText(p.getNombre());
         Labelreferencia.setText(Integer.toString(p.getRef_caja()));
         Labelfechaingreso.setText(""+fechaI);
         Labelfechacaducidad.setText(""+fechaC);
         LabelStock.setText(p.getStock());
      }         
    }//GEN-LAST:event_jList_Ingreso2ValueChanged

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
            java.util.logging.Logger.getLogger(itfz_ingresp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(itfz_ingresp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(itfz_ingresp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(itfz_ingresp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new itfz_ingresp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L_aviso_infoguardada;
    private javax.swing.JLabel LabelStock;
    private javax.swing.JLabel Labelfechacaducidad;
    private javax.swing.JLabel Labelfechaingreso;
    private javax.swing.JLabel Labelnombre;
    private javax.swing.JLabel Labelreferencia;
    private javax.swing.JTextField Lcodigo_ref;
    private com.toedter.calendar.JDateChooser Lfecha_caduc;
    private com.toedter.calendar.JDateChooser Lfecha_ingreso;
    private javax.swing.JTextField Lnombre_producto;
    private javax.swing.JTextField Lstock;
    private javax.swing.JButton btn_aceptar_guardar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList_Ingreso2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
