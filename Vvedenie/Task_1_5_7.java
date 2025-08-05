package Vvedenie;

public class Task_1_5_7 {
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] result = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            result[i] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            result[firstArray.length + i] = secondArray[i];
        }
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - i - 1; j++) {
                if (result[j + 1] < result[j]) {
                    int swap = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = swap;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] firstArray = {12, 6, 4, 1, 15, 10};
        int[] secondArray = {14, 6, 5, 8, 12, 15};

        int[] result = mergeAndSort(firstArray, secondArray);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}