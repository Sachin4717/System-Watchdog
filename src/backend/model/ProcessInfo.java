package backend.model;

public class ProcessInfo {
    public long pid;
    public long ppid;
    public String status;
    public String command;

    public ProcessInfo(long pid, long ppid, String status, String command) {
        this.pid = pid;
        this.ppid = ppid;
        this.status = status;
        this.command = command;
    }
}