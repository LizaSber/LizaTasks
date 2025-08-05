package Vvedenie;

public class Task_1_5_3 {
    public static void printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length ; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4};
        printArray(numbers);
    }
}
