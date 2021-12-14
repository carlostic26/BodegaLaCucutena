package clases_tr;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//Con esta clase podemos contar con los atributos de las cajas de los productos 
public class cajas_productos implements Comparable<cajas_productos>{
    private String nombre, Stock; 
    private int ref_caja; 
    private Date fechaIng, fechaCad;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getStock() {
        return Stock;
    }
    public void setStock(String Stock) {
        this.Stock = Stock;
    }

    public Date getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(Date fechaIng) {
        this.fechaIng = fechaIng;
    }

    public Date getFechaCad() {
        return fechaCad;
    }

    public void setFechaCad(Date fechaCad) {
        this.fechaCad = fechaCad;
    }

    public int getRef_caja() {
        return ref_caja;
    }
    public void setRef_caja(int ref_caja) {
        this.ref_caja = ref_caja;
    }

   //Constructor
    public cajas_productos(String nom, int ref, Date f1, Date f2, String stock)throws ParseException {
      this.nombre=nom;
      this.ref_caja=ref;
      this.Stock=stock;
      this.fechaIng=f1;
      this.fechaCad=f2;
    }
  //--------EN CUESTION-------(NO BORRAR AUN)--------------------------
    @Override
    public int compareTo(cajas_productos o) {//<- Recibe objeto y compara sus fechas
        
        if(fechaCad.before(o.fechaCad)==true){//         
           return -1;
         }

        if(fechaCad.after(o.fechaCad)==true){//         
           return 1;
         }
        return 0;

    }
    
    static void imprimeArrayPersonas(cajas_productos[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ". " + array[i].nombre + " - Referencia: " + array[i].ref_caja + " - Fecha ingreso: " + array[i].fechaIng + "- Fecha caducidad:"+ array[i].fechaCad);
        }
    }
     //--------------------------------------------------------
    
    public static void main(String[] args) throws ParseException {
       
        /* CODIGO DE PRUEBA------------------------------
         cajas_productos[] arraycajas_fcad= new cajas_productos[5];
        arraycajas_fcad[0] = new cajas_productos("Jet", 22455, "12/05/2019","12/05/2020", "c-233");
        arraycajas_fcad[1] = new cajas_productos("Jetix", 287455, "12/05/2019","11/01/2019", "c-433");
        arraycajas_fcad[2] = new cajas_productos("corona", 92455, "12/05/2019","06/01/2019", "c-213");
        arraycajas_fcad[3] = new cajas_productos("alpina", 22455, "12/05/2019","05/01/2019", "c-533");
        arraycajas_fcad[4] = new cajas_productos("colanta", 22455, "12/05/2019","04/01/2019", "c-633");

        System.out.println("Array sin ordenar fecha de caducidad");
        imprimeArrayPersonas(arraycajas_fcad);
        // Ordeno el array de personas por altura (de menor a mayor).

        Arrays.sort(arraycajas_fcad);
        System.out.println("Array ordenado por fecha de caducidad");
        imprimeArrayPersonas(arraycajas_fcad);*/
    }
    //----------------------------------------------------------------------------
} 

