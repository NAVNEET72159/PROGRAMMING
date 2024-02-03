package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class EfficientJanitor {
    public static void main(String[] args) {
        List<Float> weights = new ArrayList<>();
        weights.add((float) 1.01);
        weights.add((float) 1.99);
        weights.add((float) 2.5);
        weights.add((float) 1.5);
        weights.add((float) 1.01);
        weights.add((float) 1.99);
        weights.add((float) 2.5);
        weights.add((float) 1.5);
        weights.add((float) 1.01);
        weights.add((float) 1.99);
        weights.add((float) 2.5);
        weights.add((float) 1.5);
        weights.add((float) 1.01);
        weights.add((float) 1.99);
        weights.add((float) 2.5);
        weights.add((float) 1.5);
        weights.add((float) 1.01);
        weights.add((float) 1.99);
        weights.add((float) 2.5);
        weights.add((float) 1.5);
        weights.add((float) 1.01);
        weights.add((float) 1.99);
        weights.add((float) 2.5);
        weights.add((float) 1.5);
        weights.add((float) 1.01);
        weights.add((float) 1.99);
        weights.add((float) 2.5);
        weights.add((float) 1.5);
        weights.add((float) 1.01);
        weights.add((float) 1.99);
        System.out.println(minimumTrips(weights));
    }
    public static int minimumTrips(List<Float> weights) {
        int trips = 0;
        float sum = 0;
        for (Float weight : weights) {
            if (sum + weight >= 3.0) {
                trips++;
                sum = weight;
            } else {
                sum += weight;
            }
            System.out.println(sum);
            System.out.println(trips);
        }
        return trips+1;
    }
}
