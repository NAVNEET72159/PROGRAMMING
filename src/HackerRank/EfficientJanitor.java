package HackerRank;

import java.util.Arrays;
import java.util.List;

public class EfficientJanitor {
    public static void main(String[] args) {
        List<Float> weights = List.of(1.01f, 1.01f, 1.01f, 1.4f, 2.4f, 1.99f, 2.5f, 1.5f);

        System.out.println(minimumTrips(weights));
    }
    public static int minimumTrips(List<Float> weight) {
        weight.sort(Float::compareTo);
        int trips = 0;
        float sum = 0;
        for (int i = 0; i < weight.size(); i++) {
            sum += weight.get(i);
            if (sum > 3){
                trips++;
                sum = 0;
                i--;
            }
            if (i == weight.size() - 1 && sum > 0) {
                trips++;
            }
        }
        return trips;
    }
}
