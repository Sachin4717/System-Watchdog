package backend.scanner;

import backend.model.ProcessInfo;
import java.io.*;
import java.util.*;

public class ProcessScanner {

    public List<ProcessInfo> scan() throws IOException {
        List<ProcessInfo> list = new ArrayList<>();
        ProcessBuilder pb = new ProcessBuilder("ps", "-eo", "pid,ppid,state,cmd");
        Process p = pb.start();

        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        br.readLine();

        while ((line = br.readLine()) != null) {
            String[] parts = line.trim().split("\s+", 4);
            if (parts.length >= 4) {
                list.add(new ProcessInfo(
                        Long.parseLong(parts[0]),
                        Long.parseLong(parts[1]),
                        parts[2],
                        parts[3]
                ));
            }
        }
        return list;
    }
}