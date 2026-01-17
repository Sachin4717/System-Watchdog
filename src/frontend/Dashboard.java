package frontend;

import backend.scanner.ProcessScanner;
import backend.detector.ZombieDetector;
import backend.model.ProcessInfo;

import java.util.*;

public class Dashboard {

    public static void main(String[] args) {
        System.out.println("=== System Watchdog : Process Monitor ===");

        try {
            ProcessScanner scanner = new ProcessScanner();
            ZombieDetector detector = new ZombieDetector();

            List<ProcessInfo> all = scanner.scan();
            List<ProcessInfo> zombies = detector.detect(all);

            System.out.println("Zombie Processes Found: " + zombies.size());
            System.out.println("----------------------------------");

            for (ProcessInfo p : zombies) {
                System.out.println("PID: " + p.pid + 
                                   " | PPID: " + p.ppid + 
                                   " | STATUS: ZOMBIE" +
                                   " | CMD: " + p.command);
            }

        } catch (Exception e) {
            System.out.println("System Watchdog Error: " + e.getMessage());
        }
    }
}