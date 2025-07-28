package Vvedenie;

public class Task_1_3_8 {
    public static boolean isPowerOfTwo(int number) {
        if (number == 0) {
            return false;
        }
        int absNumber = Math.abs(number);
        return (absNumber & (absNumber - 1)) == 0;
    }
    public static void main(String[] args) {
        int number = 5;
        System.out.println(Task_1_3_8.isPowerOfTwo(number));
    }
}
