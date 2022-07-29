package modulo2.sesion8;

import java.util.HashMap;

public class Mapa {

    public static void main(String[] args) {
        prueba_mapa();
    }

    public static void prueba_mapa() {
        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(99, "Gato");
        mapa.put(1, "Perro");
        mapa.put(1, "Animal");

        System.out.println(mapa); // mapa.tostring();

        System.out.println(mapa.get(99));

        System.out.println("Llaves" + mapa.keySet());
        System.out.println("Valores" + mapa.values());

        mapa.remove(1);
        System.out.println(mapa);

    }

}
