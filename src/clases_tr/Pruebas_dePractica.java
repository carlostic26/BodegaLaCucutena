package clases_tr;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;


public class Pruebas_dePractica {
      public static void main(String[] args) throws ParseException{
       

        // el que formatea fechas -------------------------------------------------
       String f1="03/03/2019";  
       String f2="05/03/2019"; 
       
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yy");
         Date fech2 = formateador.parse(f2);
        Date fech1 = formateador.parse(f1);
        System.out.println("fecha1: "+formateador.format(fech1)+" fecha2: "+formateador.format(fech1));   
        //--------------------------------------------------------  
      /*// String precio = String.valueOf(precio); //<- este codigo convierte un int en un String
      String fecha = "10/01/2013";
        String[] fechArray = fecha.split("/");


        int dia = Integer.valueOf(fechArray[0]);
        int mes = Integer.valueOf(fechArray[1]);
        int anio = Integer.valueOf(fechArray[2]);

        // 
        * 
        * Al mes lo resto 1 (-1) ya que el formato de Calendar el mes empieza en 0
        * Enero=0, Febrero=1, Marzo=2, ... , Diciembre=11
        * De lo contrario Diciembre (12) no funcionaria
        * 
        * 

        Calendar c1 = new GregorianCalendar(anio, mes, dia);
        System.out.println(c1.get(Calendar.DATE) + "/" + c1.get(Calendar.MONTH)
        + "/" + c1.get(Calendar.YEAR));
       //JOptionPane.showConfirmDialog(null, "La Caja del producto caduca hoy.\n ¿Desea enviarla a Estanteria de todos modos?");  
       */
   }  
      
}
