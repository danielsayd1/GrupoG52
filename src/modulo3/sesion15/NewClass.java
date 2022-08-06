/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo3.sesion15;

import java.util.HashMap;

/**
 *
 * @author Danie
 */
public class NewClass {

    public static void main(String[] args) {
        BaseDatos db = new BaseDatos(new HashMap<>());

        System.out.println(db.generarInforme_2());

        System.out.println(db.agregar(11, "Melon", 70, 13)); //Jamon Melon 4460.9

    }

}
