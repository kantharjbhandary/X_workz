package parent.child.external;

import parent.child.internal.FactoryWorker;
import parent.child.internal.Worker;

public class WorkerRunner {

        public static void main(String[] args) {
            Worker worker = new Worker();
            worker.profession();
            worker.skills();
            worker.workingHours();
            worker.salary();
            worker.workplace();

            System.out.println("-------------------------");

            FactoryWorker factoryWorker = new FactoryWorker();
            factoryWorker.profession();
            factoryWorker.skills();
            factoryWorker.workingHours();
            factoryWorker.salary();
            factoryWorker.workplace();

            System.out.println("-------------------------");

            Worker worker1 = new FactoryWorker();
            worker1.profession();
            worker1.skills();
            worker1.workingHours();
            worker1.salary();
            worker1.workplace();
        }
    }

