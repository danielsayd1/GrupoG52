package modulo1;

import java.util.Scanner;

public class Sesion_5 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String linea =/*read();*/ lector.nextLine();
        String[] arreglo = linea.split(" ");

        //double masa = Double.parseDouble(linea.split(" ")[0]);
        double masa = Double.parseDouble(arreglo[0]);
        double altura = Double.parseDouble(arreglo[1]);
        int edad = Integer.parseInt(arreglo[2]);

        /// cosas de prueba
        /*
        BigDecimal masa_2 = new BigDecimal(masa).setScale(1,RoundingMode.HALF_UP);        
        System.out.println(masa_2);*/
        if (validar_datos(masa, altura, edad)) {// respuesta == true ?
            // calculos
            double imc = calcular_imc(masa, altura);
            String riesgo = calcular_riesgo(imc, edad);
            System.out.println(String.format("%.1f", imc) + " " + riesgo);
        } else {
            // erro
            System.out.println("ERROR");
        }

    }

    public static boolean validar_datos(double masa, double altura, int edad) {
        boolean respuesta = false;
        if ((masa > 0 && masa < 150) && (altura > 0.1 && altura < 2.5) && (edad > 0 && edad < 110)) {
            respuesta = true;
        }
        return respuesta;
    }

    public static double calcular_imc(double masa, double altura) {
        double respuesta = 0;
        respuesta = masa / Math.pow(altura, 2); // (altura*altura)           
        return respuesta;
    }

    public static String calcular_riesgo(double imc, int edad) {
        String respuesta = "Medio";

        if (imc < 22 && edad < 45) {
            respuesta = "Bajo";
        } else if (imc >= 22 && edad >= 45) {
            respuesta = "Medio";
        }
        // ...

        return respuesta;

    }

}
