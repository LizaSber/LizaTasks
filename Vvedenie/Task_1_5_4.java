package Vvedenie;

public class Task_1_5_4 {
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        System.out.print("[");
        for (int i : numbers) {
            if (i > start && i < end) {
                System.out.print(i);
                if (i < numbers.length - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println("]");
        return numbers;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4};
        int start = 1;
        int end = 4;
        getSubArrayBetween(numbers, start, end);
    }
}
