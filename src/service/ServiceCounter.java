package service;

import model.Person;

public class ServiceCounter {

    private int id;
    private int serviceTime;
    private Person current;
    private int remaining;

    public ServiceCounter(int id, int serviceTime) {
        this.id = id;
        this.serviceTime = serviceTime;
    }

    public void assign(Person p) {
        this.current = p;
        this.remaining = serviceTime;
        System.out.println("Counter " + id + " serving " + p.getName());
    }

    public void process() {
        if (current != null) {
            remaining--;

            if (remaining <= 0) {
                System.out.println("Counter " + id + " finished " + current.getName());
                current = null;
            }
        }
    }

    public boolean isBusy() {
        return current != null;
    }
}