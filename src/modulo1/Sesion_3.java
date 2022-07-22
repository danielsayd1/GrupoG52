package modulo1;

import java.util.Scanner;


public class Sesion_3 {

    public static void main(String[] args) {
        //ejemplo_while();
        // prueba_do_while();
        //ejemplo_do_while();
        //prueba_for();
        //ejemplo_for();
        //factorial_for(5);
        //System.out.println(factorial(5));
        
    }

    public static void prueba_while() {
        int x = 0;
        int y = 10;
        while (x < y) {
            System.out.println(x);
            x++; //  x=x+1
        }
    }

    public static void ejemplo_while() {
        Scanner lector = new Scanner(System.in);
        String palabra = lector.nextLine();
        while (!palabra.equals("Salir del juego")) { // ! = Not 
            System.out.println(palabra);
            palabra = lector.nextLine();
        }
    }

    // def 
    public static void prueba_do_while() {
        int x = 10;
        int y = 10;
        do {
            System.out.println(x);
            x++;
        } while (x < y);
    }

    public static void ejemplo_do_while() {
        Scanner sc = new Scanner(System.in);
        String palabra = "";
        do {
            System.out.println(palabra);
            palabra = sc.nextLine();
        } while (!palabra.equals("Salir del juego"));
    }

    public static void prueba_for() {
        double i = 0;
        int contador = 0;
        for (i = 0; i < 10; i = i + 0.1) {
            System.out.println(i);
            contador++;
        }

        System.out.println("Contador " + contador);

    }

    public static void ejemplo_for() {
        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(sc.nextLine()); //  float(input())
        double sumatoria = 0;
        for (int i = 3; i < n; i++) {
            System.out.println(i);
            sumatoria += i;
        }
        System.out.println("Sumatoria" + sumatoria);
    }

    public static void factorial_for(int x) {
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial : " + factorial);
    }

    public static void factorial_while(int x) {
        int factorial = 1;
        int i = 1;
        while (i <= x) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial : " + factorial);
    }

    public static void factorial_do_while(int x) {
        int factorial = 1;
        int i = 1;
        do {
            factorial = factorial * i;
            i++;
        } while (i <= x);
        System.out.println("Factorial : " + factorial);
    }

    public static int factorial(int x) {
        int factorial = 1;
        if (x > 1) {
            return x * factorial(x - 1);
        } else {
            return factorial;
        }
    }

    public static void algo() {
    }

}
