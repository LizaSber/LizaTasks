package Vvedenie;

public class Task_1_4_12 {
    public static String isWeekend(String weekday) {
        return (weekday == "Sunday") ? "Ура, выходной!" : "Надо еще поработать";
    }
    public static void main(String[] args) {
        System.out.println("Результат проверки: " + isWeekend("Monday"));
    }
}
