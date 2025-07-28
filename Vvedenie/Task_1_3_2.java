package Vvedenie;

public class Task_1_3_2 {
    public static char charExpression(int a) {
        int backsLashCode = '\\';
        char result = (char) (backsLashCode + a);
        return (char) result;
    }
    public static void main(String[] args) {
        char a = 1;
        System.out.println(Task_1_3_2.charExpression(a));
    }
}