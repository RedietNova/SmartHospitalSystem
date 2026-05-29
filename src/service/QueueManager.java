package service;

import model.Person;
import java.util.LinkedList;
import java.util.Queue;

public class QueueManager {

    private Queue<Person> queue = new LinkedList<>();

    public void addPerson(Person p) {
        queue.add(p);
    }

    public Person serveNext() {
        return queue.poll();
    }

    public Queue<Person> getQueue() {
        return queue;
    }

    public int size() {
        return queue.size();
    }
}