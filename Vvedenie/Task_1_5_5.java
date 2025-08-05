package Vvedenie;

public class Task_1_5_5 {
    public static int[] getArrayMiddle(int[] numbers) {
            int length = numbers.length;
            if (length % 2 == 0) {
                return new int[]{numbers[length / 2 - 1], numbers[length / 2]};
            } else {
                return new int[]{numbers[length / 2]};
            }
        }

        public static void main(String[] args) {
            int[] numbers1 = {1, 2, 3, 4, 5};
            int[] numbers2 = {1, 2, 3, 4, 5, 6};

            System.out.println("Середина массива 1: " + java.util.Arrays.toString(getArrayMiddle(numbers1)));
            System.out.println("Середина массива 2: " + java.util.Arrays.toString(getArrayMiddle(numbers2)));
        }
    }

