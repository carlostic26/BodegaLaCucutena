package clases_tr;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import clases_tr.Prueba_comp_fechas;

public class Prueba_comp_fechas {  
    LinkedList fechas = new LinkedList();
    LinkedList dni = new LinkedList();
    //ESTUDIAR: Collections.max(dates);
    //MEDIANTE UN FOR SE USA Collections.max(dates); PARA LLENAR UNA COLA Y LUEGO SE SACA ESE Collections.max(dates);
    /*EJEMPLO
        Queue<cajas_productos> p = new LinkedList<>();
           for(int i=0; i==p.getSize(); i++){
             Date max_por_ahora = Collections.sort(dates);  
             p.add(cajas_productos.getFechaCad()); //<- Entra la fecha menor a la cola
           }
    */
    //Links: Obtener el minimo o maximo de una listapriority: https://stackoverflow.com/questions/11003155/change-priorityqueue-to-max-priorityqueue
    //METODO ESTATICO PARA COMPARAR Y SALIR DE MENOR A MAYOR Link: https://www.javamexico.org/blogs/payan/ordenar_objetos_por_2_o_mas_atributos


    //SE NECESITA COMPARAR LOS ELEMENTOS DE UNA LISTA LAS FECHAS MAS TEMPRANAS SALEN A UNA COLA O ARRAY 
     // Queue<Persona> cola = new PriorityQueue<Persona>();
  /* METODO ESTATICO PARA COMPARAR Y SALIR DE MENOR A MAYOR Link: https://www.javamexico.org/blogs/payan/ordenar_objetos_por_2_o_mas_atributos
    List<Persona> personas = new ArrayList<>(Arrays.asList(
                    new Persona("Oscar", 34, "Alta", "Mexico", "Zacatecas"),
                    new Persona("Oscar", 34, "Alta", "Mexico", "Mexico"),
                    new Persona("Aaron", 23, "Alta", "España", "Cordoba"),
                    new Persona("Pepe", 22, "Alta", "Albania", "Tirana"),
                    new Persona("Rodri", 23, "Alta", "España", "Cordoba"),
                    new Persona("Juan", 23, "Baja", "España", "Vitoria"),
                    new Persona("Rodri", 23, "Alta", "España", "Jaen")
                ));

    Comparator<Persona> comparador =  new Comparator<Persona>() {
        public int compare( Persona a, Persona b ) {
            int resultado = Integer.compare( a.edad(), b.edad());
            if ( resultado != 0 ) { return resultado; }

            //resultado = comparaPrioridad( a.prioridad(), b.prioridad() );
            //if ( resultado != 0 ) { return resultado; }

            resultado = a.pais().compareTo(b.pais()); 
            if ( resultado != 0 ) { return resultado; }

            resultado = a.ciudad().compareTo(b.ciudad()); 
            if ( resultado != 0 ) { return resultado; }

            resultado = a.nombre().compareTo(b.nombre());
            return resultado;
        }
    };

    System.out.printf( "Antes: %s%n", personas );
    Collections.sort(personas,  comparador );
    System.out.printf( "Despues: %s%n",  personas );    
 */
    
    
    
   public static Boolean comparando(String f1, String f2) throws ParseException{

       
       
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); //<- Creando objeto de la clase SimpleDateFormat
        Date date1=sdf.parse(f1); // true, false, true, false, true, false
        Date date2=sdf.parse(f2);
        Date date3=sdf.parse("1995/02/23");
        
        //Si las dos fechas son iguales
        System.out.println("Fecha 1 = fecha 3? = "+date1.equals(date3));//muestra true (verdadero)
        System.out.println("Fecha 1 = fecha 2? = "+date1.equals(date2));//muestra false (falso)        
        
       //pregunta fecha posteriores
       System.out.println("Fecha 2 mayor que fecha 1? = "+date2.after(date1));//<- muestra true Si date2 es posterior a date1
       System.out.println("Fecha 1 mayor que fecha 2? = "+date1.after(date2));//<- muestra false Si date1 es posterior a date2
       
       //pregunta fecha panteriores
       System.out.println("Fecha 1 menor que fecha 2? = "+date1.before(date2)); //<- muestra true Si date1 es anterior a date2
       System.out.println("Fecha 2 menor que fecha 1? = "+date2.before(date1)); //<- muestra false Si date2 es anterior a date1          
            
   return null;
            
  }

}
