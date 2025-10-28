package bucles;

public class Bucle {
    /**
     * Este main todo imprime una cuenta regresiva de 1 a 10.
     *
     * @param args los argumentos que se pasan al ejecutar el main todo
     */
    public static void main(String[] args) {
        // Ciclo For
        final int MAX_ITERATION_COUNT = 5;
        System.out.println("Ciclo for");
        for (int currentNumber = 0; currentNumber < MAX_ITERATION_COUNT; currentNumber++) {
            System.out.println("Contando: " + (currentNumber+1));
        }
        // Ciclo while
        System.out.println("Ciclo while");
        int counter = 0,acumulador=0;
        while (counter < 10) {
            System.out.println("Contando: " + (counter+1));
            counter++;
            acumulador += counter;
        }
        System.out.println("Acumulador: " + acumulador);

        // Ciclo do while
        System.out.println("Ciclo do while");
        counter = 0;
        do {
            System.out.println("Contando: " + (counter+1));
            counter++;
            acumulador += counter;
        } while (counter < 10);
        System.out.println("Acumulador: " + acumulador);
    }
}
