package clases_tr;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Pruebas_listas {
    public static ArrayList listacajasporProducto = new ArrayList();
    public static ArrayList fechas_caduc = new ArrayList();
    //variables para el metodo de info_cajas---------
    String nombre, Stock;
    int ref_caja;
    Date fechaIng, fechaCad;
    
    //-------------GETTERS Y SETTERS-----------------------------
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
    
    LinkedList Lista1 = new LinkedList(); //<- creando una lista de proceso, recibira todos los datos, sera lista individual por datos
    LinkedList ref_cajas = new LinkedList();
    LinkedList fecha_cad = new LinkedList(); 
    LinkedList stock = new LinkedList(); 
    LinkedList fecha_ing = new LinkedList(); 
    
    public static void guardarEnLista(int ref, String fecha){
        listacajasporProducto.add(ref);
        fechas_caduc.add(fecha);
    }  
    public static String mostrar_cajas_ref(){       
        return listacajasporProducto.toString();
    }    
    public static String mostrar_fechas_caduc(){       
        return listacajasporProducto.toString();
    }    
    
    //CON LINKEDLIST
    
 public LinkedList Listainfo(LinkedList Lista1){
     
     return Lista1;
 }   
  /*Hay un problema con la cola, se necesita almacenar en ella las fechas mas cercanas 
   a la actual, pero no sabemos como sacar esas fechas de la lista1 para poder compararlas, 
   y asi mostrarlas desde la mas temprana a la mas lejana*/
 
  // Solucion: crear un Jlist e identificar sus 4 campos, para saber quien es quien y como llamarlos despues
 
    //comparar fechas y luego meterlas en la cola
    public void info_cajas(String nom, int ref, String f1, String f2, String stock)throws ParseException{ 
      this.nombre=nom;
      this.ref_caja=ref;
      this.Stock=stock;
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //<- Creando objeto de la clase SimpleDateFormat
      java.util.Date fechaI=sdf.parse(f1);
      this.fechaIng = fechaI; //<- formateando un string en fecha    
      java.util.Date fechaC=sdf.parse(f2);//<- formateando un string en fecha
      this.fechaCad = fechaC;
      
    }        
    
    //Metodos para retornar valores
    public LinkedList retornar_ref_caja(){
        return ref_cajas;
    }
    
    public LinkedList retornar_fecha_caduc(){
        return fecha_cad;
    }
}
