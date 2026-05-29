package model;

public class Person {

    protected int id;
    protected String name;
    protected int patience;
    protected ServiceType serviceType;
    protected int waitingTime = 0;

    public Person(int id, String name, ServiceType serviceType) {
        this.id = id;
        this.name = name;
        this.serviceType = serviceType;
        this.patience = 100;
    }

    public void waitOneStep() {
        waitingTime++;
        patience -= 5;
    }

    public boolean hasLeft() {
        return patience <= 0;
    }

    public String getName() {
        return name;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }
}