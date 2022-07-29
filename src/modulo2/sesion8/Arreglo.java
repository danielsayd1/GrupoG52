package modulo2.sesion8;

import java.util.ArrayList;
import modulo2.sesion7.Animal;
import modulo2.sesion7.Gato;

public class Arreglo {

    public static void main(String[] args) {
        probar_arreglo_4();
    }

    public static void probar_arreglo() {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Primer elemento");
        lista.add("Elemento 2");

        System.out.println(lista);
        System.out.println(lista.get(1));

        lista.set(0, "Otra cosa");
        System.out.println(lista);

        lista.add(1, "x");
        System.out.println(lista);

        lista.remove(0);
        System.out.println(lista);

        lista.remove("x");
        System.out.println(lista);
    }

    public static void probar_arreglo2() {
        ArrayList<Double> lista = new ArrayList<Double>();

        lista.add(90d);
        lista.add(20d);
        lista.add(0.00001);

        System.out.println(lista);

    }

    public static void probar_arreglo_3() {
        ArrayList<Number> lista = new ArrayList<>();

        lista.add(123);
        lista.add(2.3f); // float
        lista.add(0.00001);
        lista.add(3.14d); // double

        System.out.println(lista);
    }

    public static void probar_arreglo_4() {
        ArrayList<Object> lista = new ArrayList<>();

        lista.add(123);
        lista.add(2.3f); // float
        lista.add(0.00001);
        lista.add(3.14d); // double

        lista.add(new Gato("Michi", "2", "Marta", "Blanco", "7"));

        lista.add("Texto");
        lista.add(true);
        lista.add(null);
        lista.add('a');

        lista.add(new Gato("Michi 2", "NN", "Carlos", "Negro", "10"));
        lista.add(new Animal("Gris", "99"));

        ArrayList<Number> lista2 = new ArrayList<>();
        lista2.add(123);
        lista2.add(2.3f); // float
        lista2.add(0.00001);
        lista2.add(3.14d); // double

        lista.add(lista2);

        System.out.println(lista);
    }

}
