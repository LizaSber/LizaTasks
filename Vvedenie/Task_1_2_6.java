package Vvedenie;

public class Task_1_2_6 {
        public int drawisMonitorsCounter(int monitors, int programmers) {
            monitors = 100;
            programmers = 65;
            int extraMonitor = monitors % programmers;
            System.out.println(extraMonitor);
            return extraMonitor;
        }
    }
