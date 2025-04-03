package parent.child.external;

import parent.child.internal.RemoteWork;
import parent.child.internal.Work;

public class WorkRunner {



        public static void main(String[] args) {
            Work work = new Work();
            work.type();
            work.environment();
            work.salary();
            work.industry();
            work.hours();

            System.out.println("-------------------------");

            RemoteWork remoteWork = new RemoteWork();
            remoteWork.type();
            remoteWork.environment();
            remoteWork.salary();
            remoteWork.industry();
            remoteWork.hours();

            System.out.println("-------------------------");

            Work work1 = new RemoteWork();
            work1.type();
            work1.environment();
            work1.salary();
            work1.industry();
            work1.hours();
        }
    }

