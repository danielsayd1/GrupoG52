/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo2.sesion9;

import java.util.ArrayList;

/**
 *
 * @author Danie
 */
public class Main {

    public static void main(String[] args) {
        Empleado reJefe = new Empleado(1l, "Pepito");
        System.out.println(reJefe);
        
        
        Empleado empleado_1= new Empleado(2l, "Carlos", reJefe);
        System.out.println(empleado_1);
        
        reJefe=null;
        
        Empleado empleado_2= new Empleado(3l, "Marco", empleado_1);
        System.out.println(empleado_2);
    }

    public static void pruebaCelular() {
        Procesador procesador_1 = new Procesador(1, 2.5, "i3");
        System.out.println(procesador_1);

        Celular celular_1 = new Celular("Iphone", "Apple", "3123455", new Procesador(2, 1.8, "A15"));
        System.out.println(celular_1);

        System.out.println(celular_1.getProcesador());

    }

    public static void pruebaBodega() {
        Producto producto_1 = new Producto(1l, "Jamon", 12000.0);
        System.out.println(producto_1);

        Bodega bodega_1 = new Bodega(10, new ArrayList<>(), "Calle Falsa 123");
        bodega_1.agregarProducto(producto_1);
        System.out.println(bodega_1);

        Bodega bodega_2 = new Bodega(1, "Otra direccion");
        System.out.println(bodega_2.agregarProductoB(producto_1));
        //bodega_2.setInventario(new ArrayList<>());
        System.out.println(bodega_2);

    }
}
