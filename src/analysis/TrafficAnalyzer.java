package analysis;

import java.util.HashMap;
import java.util.Map;

public class TrafficAnalyzer {

    private Map<Integer, Integer> traffic = new HashMap<>();

    public void record(int hour) {
        traffic.put(hour, traffic.getOrDefault(hour, 0) + 1);
    }

    public int getPeakHour() {

        int peak = 0;
        int max = 0;

        for (int h : traffic.keySet()) {
            if (traffic.get(h) > max) {
                max = traffic.get(h);
                peak = h;
            }
        }

        return peak;
    }
}