/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo2.sesion10;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Danie
 */
public class Main {

    public static void main(String[] args) {
        final int ID = 0;
        final int NOMBRE = 1;
        final int DIRECCION = 2;
        final int TELEFONO = 3;

        Scanner lector = new Scanner(System.in);

        Agenda agenda = new Agenda(new HashMap<>());
        System.out.println(agenda);
        
        String operacion = lector.nextLine().toUpperCase();
        String[] informacion = lector.nextLine().split(" ");

        if ("AGREGAR".equals(operacion)) {
            boolean resultado = agenda.agregar(Integer.parseInt(informacion[ID]), informacion[NOMBRE], informacion[DIRECCION], informacion[TELEFONO]);
            System.out.println(resultado ? agenda.generarInforme() : "ERROR");

        } else if ("ACTUALIZAR".equals(operacion)) {
            boolean resultado = agenda.actualizar(Integer.parseInt(informacion[ID]), informacion[DIRECCION], informacion[TELEFONO]);
            if (resultado) {// resultado == true
                System.out.println(agenda.generarInforme());
            } else {
                System.out.println("ERROR");
            }

        } else if ("BORRAR".equals(operacion)) {
            boolean resultado = agenda.eliminar(Integer.parseInt(informacion[ID]), informacion[NOMBRE], informacion[DIRECCION], informacion[TELEFONO]);
            if (resultado) // resultado == true
            {
                System.out.println(agenda.generarInforme());
            } else {
                System.out.println("ERROR");
            }

        } else {
            System.out.println("ERROR");
        }

        
        System.out.println(agenda);
    }

}
