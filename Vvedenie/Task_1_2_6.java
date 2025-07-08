package Vvedenie;

public class Task_1_2_6 {
        public int drawisMonitorsCounter(int monitors, int programmers) {
            int extraMonitor = monitors % programmers;
            System.out.println(extraMonitor);
            return extraMonitor;
        }
    }
