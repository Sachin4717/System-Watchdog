# System Watchdog

## Description
System Watchdog is a Java-based system monitoring utility designed to scan operating system processes, detect zombie or inactive processes by analyzing their states, and report them to the user to assist in system resource optimization.

---

## Problem Statement
In many systems, certain processes terminate but remain in the process table without being properly cleaned up by their parent processes. These zombie or inactive processes can cause confusion during system monitoring and debugging. Manually identifying such processes is difficult and inefficient.

---

## Objectives
- Monitor running system processes
- Detect zombie or inactive processes at the operating system level
- Display detected processes in a clear and structured format
- Help users understand and analyze system resource usage

---

## Tech Stack
- **Programming Language:** Java  
- **Platform:** Linux / WSL Ubuntu (recommended), Git Bash (demo mode)  
- **Tools:** VS Code, Git, GitHub  
- **Core Concepts:**  
  - Process Management  
  - OS-level Commands  
  - Java ProcessBuilder  
  - Modular Backend–Frontend Architecture  

---

## Project Structure
```
System_Watchdog/
├── src/
│   ├── backend/
│   │   ├── model/
│   │   ├── scanner/
│   │   └── detector/
│   └── frontend/
│       └── Dashboard.java
├── resources/
│   ├── styles.css
│   └── report.csv
└── README.md
```

---

## How It Works
1. The backend executes system-level commands to fetch active system processes  
2. Each process is analyzed based on its execution state  
3. Zombie or inactive processes are identified  
4. The frontend displays the detected processes to the user  
5. A report file can be generated for further analysis  

---

## How to Run
### Prerequisites
- Java JDK 11 or later  
- Linux or WSL Ubuntu (recommended for accurate zombie detection)  
- VS Code  

### Steps
```bash
cd System_Watchdog/src
javac backend/model/*.java backend/scanner/*.java backend/detector/*.java frontend/Dashboard.java
java frontend.Dashboard
```

---

## Sample Output
```
=== System Watchdog : Process Monitor ===
Zombie Processes Found: 1
----------------------------------
PID: 2456 | PPID: 1 | STATUS: ZOMBIE | CMD: sleep 100
```

---

## Author
Sachin Kumar

---

## License
This project is developed for educational and academic purposes.
