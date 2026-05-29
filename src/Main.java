import model.*;
import service.*;
import analysis.*;

public class Main {

    public static void main(String[] args) {

        QueueManager queue = new QueueManager();

        queue.addPerson(new Person(1, "Alice", ServiceType.REGISTRATION));
        queue.addPerson(new VIPPerson(2, "Bob", ServiceType.SUPPORT));
        queue.addPerson(new EmergencyPerson(3, "Charlie", ServiceType.EMERGENCY));

        SimulationEngine sim = new SimulationEngine(queue);
        sim.run(10);

        TrafficAnalyzer analyzer = new TrafficAnalyzer();
        analyzer.record(9);
        analyzer.record(9);
        analyzer.record(10);

        RecommendationEngine rec = new RecommendationEngine();

        int peak = analyzer.getPeakHour();

        System.out.println(rec.recommend(peak, 35));
    }
}