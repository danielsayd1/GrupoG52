/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo2.sesion10;

import java.util.HashMap;
import javax.annotation.PostConstruct;

/**
 *
 * @author Danie
 */
public class Agenda {

    private HashMap<Integer, Persona> listaPersona;

    public Agenda(HashMap<Integer, Persona> listaPersona) {
        this.listaPersona = listaPersona;
        this.init();
    }

    private void init() {
        this.agregar(1, "Marta", "Calle  Falsa", "123");
        this.agregar(2, "Maria", "Carrera  Falsa", "9999");
        this.agregar(3, "Daniel", "Av  Falsa", "123123");
        this.agregar(4, "Susan", "Falsa 123", "44444");
        this.agregar(5, "Sofia", "Calle  Falsa", "4444");
    }

    @Override
    public String toString() {
        return "Agenda=" + listaPersona;
    }

    public boolean verificarExistencia(int id) {
        boolean resutlado = listaPersona.containsKey(id);
        return resutlado;
    }

    public boolean verificarExistencia_alt(int id) {
        boolean resutlado = false;
        Persona persona_x = listaPersona.get(id);
        resutlado = (persona_x != null); // -. Si/No
        return resutlado;
    }

    public Persona verificarExistencia_alt_2(int id) {
        return listaPersona.get(id);// no = null 
    }

    public boolean agregar(int id, String nombre, String direccion, String telefono) {
        if (!verificarExistencia(id)) {
            Persona persona = new Persona(id, nombre, direccion, telefono);
            listaPersona.put(id, persona);
            return true;
        }
        return false;
    }

    public boolean actualizar(int id, String direccion, String telefono) {
        if (verificarExistencia(id)) {
            Persona persona = listaPersona.get(id);
            persona.setDireccion(direccion);
            persona.setTelefono(telefono);
            listaPersona.put(id, persona);
            return true;
        }
        return false;
    }

    public boolean actualizar_alt(int id, String direccion, String telefono) {
        if (verificarExistencia(id)) {
            listaPersona.get(id).setDireccion(direccion);
            listaPersona.get(id).setTelefono(telefono);
            return true;
        }
        return false;
    }

    public boolean eliminar(int id, String nombre, String direccion, String telefono) {
        if (verificarExistencia(id)) {
            listaPersona.remove(id);
            return true;
        }
        return false;
    }

    public double generarInforme() {
        return listaPersona.size();
    }
}
