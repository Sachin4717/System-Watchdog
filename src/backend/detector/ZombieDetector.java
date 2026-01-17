package backend.detector;

import backend.model.ProcessInfo;
import java.util.*;

public class ZombieDetector {

    public List<ProcessInfo> detect(List<ProcessInfo> processes) {
        List<ProcessInfo> zombies = new ArrayList<>();
        for (ProcessInfo p : processes) {
            if (p.status.equals("Z")) {
                zombies.add(p);
            }
        }
        return zombies;
    }
}