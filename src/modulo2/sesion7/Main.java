package modulo2.sesion7;

public class Main {

    public static void main(String[] args) {
        
        Cuadrado figura_1= new Cuadrado(3, "Color");
        System.out.println(figura_1.calcular_area());
        System.out.println(figura_1.getColor());
        
        Animal animal_1= new Animal("verde", "muchos");
        animal_1.dormir();
        


    }

    public static void prueba_animal() {
        Animal animal_1 = new Animal("Rojo", "3 anios", 12);
        System.out.println(animal_1.getColor());
        System.out.println(animal_1.getEdad());

        Gato animal_2 = new Gato("Michi", "no se", "Alex", "Negro", "45");
        System.out.println(animal_2.getColor());
        System.out.println(animal_2.getEdad());
        animal_2.setAltura(90);
        System.out.println("Es un animal ? " + (animal_2 instanceof Animal));
        System.out.println("Es un Gato ? " + (animal_2 instanceof Gato));

        Animal animal_3 = new Gato("Gato X", "Valodar", "Aleja", "Cafe", "99", 123);
        System.out.println(animal_3.getColor());
        System.out.println(animal_3.getEdad());
        System.out.println(animal_3.getAltura());
        animal_3.dormir();
        //System.out.println(animal_3.getNombre());
        //System.out.println("Es un Numero  ? " +( animal_3 instanceof Double));
        System.out.println("Es un animal ? " + (animal_3 instanceof Animal));
        System.out.println("Es un Gato ? " + (animal_3 instanceof Gato));
    }

}
