package service;

import model.Person;
import java.util.Iterator;

public class SimulationEngine {

    private QueueManager queueManager;

    public SimulationEngine(QueueManager queueManager) {
        this.queueManager = queueManager;
    }

    public void run(int steps) {

        for (int i = 0; i < steps; i++) {

            Iterator<Person> it = queueManager.getQueue().iterator();

            while (it.hasNext()) {
                Person p = it.next();

                p.waitOneStep();

                if (p.hasLeft()) {
                    System.out.println(p.getName() + " left due to frustration");
                    it.remove();
                }
            }
        }
    }
}