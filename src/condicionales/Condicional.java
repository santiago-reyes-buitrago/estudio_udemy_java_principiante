package condicionales;

public class Condicional {
    /**
     * The main method of this program prints out whether a person can vote
     * based on their age.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        byte age = 20;
        double average = 7.5;
        // Estructura mas mantenible
        boolean isAdult = age > 17;
        boolean hasPassingGrade = average >= 7;
        if (isAdult && hasPassingGrade) {
            System.out.println("El estudiante cumple con todos los requisitos");
        }

        if (isAdult){
            System.out.println("Es un adulto");
        }

        //Estructura tosca
//        else if (age <= 0) {
//            System.out.println("no es una edad valida");
//        } else {
//            System.out.println("You can't vote");
//        }

//        byte day = 8;
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid day");
//                break;
//        }
    }
}
