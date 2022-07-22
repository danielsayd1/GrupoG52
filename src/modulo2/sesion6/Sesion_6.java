package modulo2.sesion6;

public class Sesion_6 {

    public static void main(String[] args) {
        Gato michi = new Gato(10, "Michi", "Negro");

        System.out.println(michi.getEdad());
        michi.setEdad(9);
        System.out.println(michi.getEdad());
        
        

    }

    public static void prueba_perro() {
        Perro elMechas = new Perro(7, "Mechas", "Cafe");

        System.out.println(elMechas.nombre);
        System.out.println(elMechas.color);

        elMechas.ladrar();

        Perro manchas = new Perro("Manchas");
        System.out.println(manchas.nombre);
        System.out.println(manchas.color);
        System.out.println(manchas.edad);

        System.out.println(manchas.altura);
        System.out.println(manchas.altura_2);

        manchas.altura = 1.7f;
        manchas.altura_2 = 1.7f;

        System.out.println(manchas.altura);
        System.out.println(manchas.altura_2);

        Perro otro = new Perro(7, "Mechas", "Cafe");
        System.out.println(otro.equals(elMechas));

        System.out.println("Amigo " + otro.amigo);
        otro.conocer(elMechas);
        System.out.println("Amigo " + otro.amigo);

    }

}
