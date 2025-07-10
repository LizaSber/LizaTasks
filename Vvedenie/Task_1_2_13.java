package Vvedenie;

public class Task_1_2_13 {
    public static double calcCircleRadius(double area) {

        double radius = Math.sqrt(area/Math.PI);

        System.out.printf("Radius = %.3f", radius);
        return radius;
    }
}
