package Vvedenie;

public class Task_1_5_6 {
    public static int[] inverseArray(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        for (int number : numbers) {
            System.out.println(number);
        }
        return numbers;
    }

        public static void main(String[] args) {
            int[] numbers = new int[]{1, 2, 3, 4};
            inverseArray(numbers);
    }
}
