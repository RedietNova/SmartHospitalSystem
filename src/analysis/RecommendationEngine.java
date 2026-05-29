package analysis;

public class RecommendationEngine {

    public String recommend(int peakHour, double avgWaiting) {

        if (avgWaiting > 30) {
            return "Increase service counters at hour: " + peakHour;
        }

        return "System is stable.";
    }
}