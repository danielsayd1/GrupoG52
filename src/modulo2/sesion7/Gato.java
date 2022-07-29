package modulo2.sesion7;

public class Gato extends Animal {

    private String nombre;
    private String raza;
    private String dueno;

    public Gato(String nombre, String raza, String dueno, String color, String edad, int altura) {
        super(color, edad, altura);
        this.nombre = nombre;
        this.raza = raza;
        this.dueno = dueno;
    }

    public Gato(String nombre, String raza, String dueno, String color, String edad) {
        super(color, edad);
        this.nombre = nombre;
        this.raza = raza;
        this.dueno = dueno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    @Override
    public void dormir() {
        System.out.println("Miiiiii  miiiiii.");
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", raza=" + raza + ", dueno=" + dueno + '}';
    }
}
