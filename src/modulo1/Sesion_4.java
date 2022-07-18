package modulo1;

import java.util.Scanner;

public class Sesion_4 {

    public static void main(String[] args) {
        ejercicio_1();
    }

    public static void prueba_arreglo() {
        String palabras[] = new String[5];
        palabras[1] = "Hola";
        palabras[3] = "Grupo";
        palabras[2] = 99 + "";
        palabras[2] = 100 + "";

        System.out.println(palabras.length);
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("[" + i + "] = " + palabras[i]);
        }

        System.out.println(palabras[1]);
    }

    public static void prueba_cadenas() {
        String cadena = "Hola Grupo";

        String subCadena = cadena.substring(1, 4);
        System.out.println(subCadena); // ola
        System.out.println(subCadena.length());

        String subCadena2 = cadena.substring(4);
        System.out.println(subCadena2.toLowerCase());// ' ',
        System.out.println(subCadena2.toUpperCase());// ' ',
        System.out.println(subCadena2.length());

        String a = "Hola" + " Mundo";
        System.out.println(a);

        cadena = "Hola Grupo";
        //System.out.println(cadena.split(" "));
        imprimir_array(cadena.split(""));
    }

    public static void imprimir_array(String[] arreglo) {
        String contenido = "[";
        for (int i = 0; i < arreglo.length; i++) {
            //System.out.println(arreglo[i]);
            contenido += arreglo[i] + ",";
        }
        contenido = contenido.substring(0, contenido.length() - 1);
        contenido += "]";
        System.out.println("Contenido : " + arreglo.length);
        System.out.println("Contenido : " + contenido);

    }

    public static void prueba_foreach() {
        String palabras[] = new String[5];
        palabras[1] = "Hola";
        palabras[3] = "Grupo";
        palabras[2] = 99 + "";
        palabras[2] = 100 + "";

        for (String x : "Hola mundo".split("")) {
            System.out.println(x);
        }

    }

    public static void ejercicio_1() {
        int tamanio = 10;
        int numeros[] = new int[tamanio];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < tamanio; i++) {
            numeros[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Promedio: " + getPromedio(numeros));
        System.out.println("Desviacion Estandar: " + getDesviacionEstandar(numeros));
    }

    public static double getPromedio(int[] arreglo) {
        double resultado = 0d;
        double sumatoria = 0;
        for (int numero : arreglo) {
            sumatoria += numero;
        }
        resultado = sumatoria / arreglo.length;
        return resultado;
    }

    public static double getDesviacionEstandar(int[] arreglo) {
        double resultado = 0d;
        double sumatoria = 0;
        double promedio = getPromedio(arreglo);
        for (int numero : arreglo) {
            sumatoria += Math.pow((numero - promedio), 2);
        }
        resultado = Math.sqrt(sumatoria / (arreglo.length - 1));

        return resultado;
    }

}
