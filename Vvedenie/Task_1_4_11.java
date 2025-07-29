package Vvedenie;

public class Task_1_4_11 {
    public static boolean isWeekend(String weekday) {
        if (weekday == "Saturday" && weekday == "Sunday") {
            return true;
        }
        else if (weekday != "Saturday" && weekday != "Sunday") {
            return false;
        }
        else {
            return false;
        }
        }
    public static void main(String[] args) {
        System.out.println("Результат проверки: " + isWeekend("Monday"));
    }
}
