package Clase_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //cargar 3 numeros y mostrar el mayor y el menor
        Scanner teclado = new Scanner(System.in);
        System.out.println("cargue el primer numero :");
        int numero1 = teclado.nextInt();
        System.out.println("cargue el segundo numero :");
        int numero2 = teclado.nextInt();
        System.out.println("cargue el tercer numero :");
        int numero3 = teclado.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("el primer numero es el mayor");
        }
        if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("el segundo numero es el mayor");
        }
        if (numero3 > numero2 && numero3 > numero1) {
            System.out.println("el tercer numero es el mayor");
        }
    }
}
