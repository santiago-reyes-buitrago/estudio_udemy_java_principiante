package scanner;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero para a: ");
        int a = sc.nextInt();
        System.out.println("Imprimir A: " + a);
        System.out.print("Ingrese un numero para b: ");
        int b = sc.nextInt();
        System.out.println("Imprimir B: " + b);
        System.out.println("Suma de A: " + a + " + B: " + b + " = " + (a + b));
        System.out.println("Resta de A: " + a + " - B: " + b + " = " + (a - b));
        System.out.println(a>b ? "El numero a es mayor":"El numero b es mayor");
    }
}
