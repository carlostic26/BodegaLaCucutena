package clases_tr;

import java.util.ArrayList;
import java.util.Date;
/*Pedidos_producto: Contiene una Lista con los pedidos por cada producto que
cuenten con menos de 5 cajas en almacén.*/

public class pedidoProducto {
    ArrayList listacajasporProducto = new ArrayList();

    public ArrayList entrarProducto(cajas_productos c) {
        listacajasporProducto.add(c);
        return listacajasporProducto;
    }

    public void pedidos_producto(ArrayList listacajasporProducto) {
        ArrayList prodmenosde5cajas = new ArrayList();

    }

    public void ofertas_producto(Date fechaactual, ArrayList listcajasProducto) {

    }

}
