package Clase_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.println("Cuantos años de vida tiene el perro: ");
        double edadDelPerro = cargaDeDatos.nextDouble();
        double real = 7 * edadDelPerro;
        System.out.println("La Edad de Perro es " + real);
    }
}
