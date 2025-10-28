package final_proyect;

import java.util.Scanner;

public class FinalProyect {
    public static void main(String[] args) {
        final int MAX_GRADE_CALIFICATIONS = 3;
        Scanner scanner = new Scanner(System.in);
        int average=0,age;
        System.out.print("Ingresa tu edad: ");
        age = scanner.nextInt();
        for (int currentGrade = 0; currentGrade < MAX_GRADE_CALIFICATIONS; currentGrade++) {
            System.out.print("Ingresa tu calificacion (1 a 10): ");
            average += scanner.nextInt();
        }
        average = average / MAX_GRADE_CALIFICATIONS;
        System.out.println("Edad: " + age);
        System.out.println("Promedio: " + average);
        System.out.println(average>=6 ? "Aprobado" : "Reprobado");

    }
}
