package variables_primitivas.constants;

public class Constant {
    /**
     * This is the main method which is the entry point of the program.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
//        int workDays = 10;
//        workDays=20;
//        workDays=30;
//        final double annualInterest  = 0.05;
        final double TAX_RATE = 0.10;
        int grossSalary = 3000;
        double netSalary = grossSalary * (1 - TAX_RATE);
        System.out.println("Net Salary = " + netSalary);
    }
}
