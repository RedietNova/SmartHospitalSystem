package model;

public class EmergencyPerson extends Person {

    public EmergencyPerson(int id, String name, ServiceType serviceType) {
        super(id, name, serviceType);
        this.patience = 200;
    }
}