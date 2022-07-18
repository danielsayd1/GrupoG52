package modulo1;

import java.awt.Component;
import java.awt.Frame;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Sesion_2 {

    public static void main(String[] args) {
        Component frame = new Frame();
        JOptionPane.showMessageDialog(frame, "hola");
        System.out.println("Area " + area_rectangulo(20.1, 2.0));
        System.out.println("Area " + area_rectangulo(5.7, 3.2));

        Scanner lector = new Scanner(System.in);
        String operacion = lector.nextLine().toLowerCase();
        int a = 20;
        int b = 66;
        /*
        if (operacion.equals("Sumar")) {
            System.out.println("La suma es " + (a + b));
        } else if ("Restar".equals(operacion)) {
            System.out.println("La resta es " + (a - b));
        } else if (operacion.equals("Multiplicar")) {
            System.out.println("La multiplicacion es " + (a * b));
        } else {
            System.out.println("Operación desconocida");
        }*/

        switch (operacion) {
            case "sumar":
                System.out.println("La suma es " + sumar(a, b));
                break;
            case "restar":
                System.out.println("La resta es " + restar(a, b));
                break;
            case "multiplicar":
                System.out.println("La multiplicacion es " + multiplicar(a, b));
                break;
            default:
                System.out.println("Operación desconocida");
                break;
        }

    }

    public static int sumar(int x, int y) {
        int resultado = x + y;
        return resultado;
    }

    public static int restar(int a, int b) {
        int resultado = a - b;
        return resultado;
    }

    public static int multiplicar(int juanito, int pepito) {
        int resultado = juanito * pepito;
        return resultado;
    }

    public static double dividir(int a, int b) {
        double resultado = a / b;
        return resultado;
    }

    public static double area_rectangulo(double base, double altura) {
        double resultado = base * altura;
        return resultado;
    }

}
