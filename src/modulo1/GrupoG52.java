package modulo1;

import java.util.Scanner;

public class GrupoG52 {

    public static void main(String[] args) {
        long l = 10l;
        int x = 9;      
        x=(int)l;

        float y =   1.9f;// 1.9d
        double z= 1.9;


        System.out.println(x);
        System.out.println(y);
        System.out.println("Hola mundo");


        Scanner lector = new Scanner(System.in);

        String nombre = lector.nextLine();
        int edad = lector.nextInt();

        System.out.println(nombre+" tiene "+edad);


    }
}
