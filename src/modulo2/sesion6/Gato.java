package modulo2.sesion6;

public class Gato {

    private int edad;
    private String nombre;
    private String color;


    public Gato(int edad, String nombre, String color) {
        this.edad = edad;
        this.nombre = nombre;
        this.color = color;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        if (edad < 100 && edad > 0) {
            this.edad = edad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
