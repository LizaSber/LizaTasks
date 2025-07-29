package Vvedenie;

public class Task_1_4_10 {
    public static boolean isWeekend(String weekday) {
        switch (weekday){
            case "Monday":
                return false;
            case "Tuesday":
                return false;
            case "Wednesday":
                return false;
            case "Thursday":
                return false;
            case "Friday":
                return false;
            case "Saturday":
                return true;
            case "Sunday":
                return true;
            default:
                return false;
        }
    }
    public static void main(String[] args) {
     System.out.println("Результат проверки: " + isWeekend("Monday"));
    }
}