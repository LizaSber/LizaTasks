package Vvedenie;

public class Task_1_4_9 {
    public static int determineGroup(int age) {
        if (age <= 13 && age >= 7) {
            return 1;
        } else if (age <= 17 && age >= 14) {
            return 2;
        } else if (age <= 65 && age >= 18) {
            return 3;
        } else {
            System.out.println("Возраст не входит в диапазон");
            return -1;
        }
    }
    public static void main(String[] args) {
        int age = 100;
        System.out.println(Task_1_4_9.determineGroup(age));
    }
}
