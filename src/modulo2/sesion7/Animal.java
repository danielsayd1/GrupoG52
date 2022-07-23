package modulo2.sesion7;

public class Animal {

    private String color;
    private String edad;
    private int altura;

    public Animal(String color, String edad, int altura) {
        this.color = color;
        this.edad = edad;
        this.altura = altura;
    }

    public Animal(String color, String edad) {
        this.color = color;
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public  void dormir(){
        System.out.println("ZZZZZzzzz......");
    }

}
