package modulo3.sesion14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BaseDatos {

    private HashMap<Integer, Producto> listaProducto;

    public BaseDatos(HashMap<Integer, Producto> listaProducto) {
        this.listaProducto = listaProducto;
        this.initBaseDatos();
    }

    private void initBaseDatos() {
        listaProducto.put(1, new Producto(1, "Manzana", 1500, 10));
        listaProducto.put(2, new Producto(2, "Pera", 1230, 12));
        listaProducto.put(3, new Producto(3, "Jamon", 134400, 1));
        listaProducto.put(4, new Producto(4, "Uva", 15440, 0));
        listaProducto.put(5, new Producto(5, "Pan", 11234, 13));
        listaProducto.put(6, new Producto(6, "Chocorramo", 5000, 11));
    }

    public List<Producto> getListaProducto() {
        return new ArrayList<>(listaProducto.values());
    }

}
