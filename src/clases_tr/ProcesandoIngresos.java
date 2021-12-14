package clases_tr;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import clases_tr.cajas_productos;


//Con esta clase podremos jugar con el Jlist, esta clase procesa los ingresos y recibe como objeto de la clase cajas_productos para agregar, obtener, borrar objetos etc..
public class ProcesandoIngresos extends AbstractListModel{
   private ArrayList listaCajas = new ArrayList<>(); //<- en este arraylist se almacenaran los objetos
   
    @Override
    public int getSize() {//<- devuelve el tamaño completo de elementos en el JList, por consecuente, este tamaño será el mismo que el de la longitud de la lista:
        return listaCajas.size(); 
    }

    @Override
    public Object getElementAt(int index) {//<- entra un indice (campo seleccionado del Jlist) para indentificar los objetos
       cajas_productos p;
       p = (cajas_productos) listaCajas.get(index);
       return p.getNombre();
    }

    public void addCajas_productos(cajas_productos p){//<- entra un objeto tipo caja y lo agrega a la lista
      listaCajas.add(p);
      this.fireIntervalAdded(this, getSize(), getSize()+1); //<- El método fireIntervalAdded permite notificarle al JList que un elemento ha sido agregado, enviandole un rango de intervalos que en este caso normalmente podemos utilizar getsize() y getsize()+1, datos obtenidos del JList
    }
    
    public void eliminarCajas_producto(int index0){//<- entra un indice (campo seleccionado del Jlist) y lo elimina
     listaCajas.remove(index0);
     this.fireIntervalRemoved(index0, getSize(), getSize()+1);
    }
    
    public cajas_productos getCajas_productos(int index){ //<- accede a los datos de una del objeto simplemente enviandole el indice que tengo seleccionado
       return (cajas_productos) listaCajas.get(index);
    }
}
