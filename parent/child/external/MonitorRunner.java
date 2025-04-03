package parent.child.external;

import parent.child.internal.GamingMonitor;
import parent.child.internal.Monitor;

public class MonitorRunner {

        public static void main(String[] args) {
            Monitor monitor = new Monitor();
            monitor.resolution();
            monitor.size();
            monitor.refreshRate();
            monitor.panelType();
            monitor.usage();

            System.out.println("-------------------------");

            GamingMonitor gamingMonitor = new GamingMonitor();
            gamingMonitor.resolution();
            gamingMonitor.size();
            gamingMonitor.refreshRate();
            gamingMonitor.panelType();
            gamingMonitor.usage();

            System.out.println("-------------------------");

            Monitor monitor1 = new GamingMonitor();
            monitor1.resolution();
            monitor1.size();
            monitor1.refreshRate();
            monitor1.panelType();
            monitor1.usage();
        }
    }

