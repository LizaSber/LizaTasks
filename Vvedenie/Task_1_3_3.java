package Vvedenie;

public class Task_1_3_3 {
    public static int getAgeDiff(byte age1, byte age2) {
        Math.abs(age1);
        Math.abs(age2);
        if (age1 > age2) {
            return (age1 - age2);
        } else {
            return (age2 - age1);
        }
    }
    public static void main(String[] args) {
        byte age1 = 55;
        byte age2 = 88;
        System.out.println(Task_1_3_3.getAgeDiff(age1, age2));
    }
}