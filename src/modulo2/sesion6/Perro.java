package modulo2.sesion6;

public class Perro {

    public int edad;
    public String nombre;
    public String color;

    public float altura;       // NO ACEPTAN NULLOS
    public Float altura_2; // SI PUEDEN SER NULL

    public String amigo;

    //  public Perro padre;
    // public Perro madre;
    
    
    public Perro() {

    }

    public Perro(int edad, String nombre, String color) {
        this.edad = edad;
        this.nombre = nombre;
        this.color = color;
    }

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public void ladrar() {
        System.out.println("Woow Wowww...");
    }

    public void conocer(Perro amigo) {
        this.amigo = amigo.nombre;
    }

}
