package variables_primitivas.data_type;

public class DataType {
    public static void main(String[] args) {
        byte age = 23;
        int viewsCount = 1_000_000,iAxis,yAxis;
        iAxis=10;
        yAxis=20;
        System.out.println("Age = " + age);
        age=30;
        long viewsCount2 = 1_000_000L;
        float price = 10.99F;
        double price2 = 10.99;
        System.out.println("xAxis = " + iAxis);
        System.out.println("yAxis = " + yAxis);
        System.out.println("Age = " + age);

        char initial = '$';
        System.out.println("Initial = " + initial);
        boolean isTeacher = true;
        System.out.println("isTeacher = " + isTeacher);
    }
}
