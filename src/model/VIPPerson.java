package model;

public class VIPPerson extends Person {

    public VIPPerson(int id, String name, ServiceType serviceType) {
        super(id, name, serviceType);
        this.patience = 150;
    }

    @Override
    public boolean hasLeft() {
        return patience <= 0;
    }
}