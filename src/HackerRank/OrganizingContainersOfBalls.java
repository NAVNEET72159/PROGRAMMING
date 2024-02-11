package HackerRank;

import java.util.List;

public class OrganizingContainersOfBalls {
    public static void main(String[] args) {
        List<List<Integer>> container = List.of(
                List.of(1, 1),
                List.of(1, 1)
        );
        System.out.println(organizingContainers(container));
    }
    public static String organizingContainers(List<List<Integer>> container) {
        int[] containerCapacity = new int[container.size()];
        int[] ballType = new int[container.size()];
        for (int i = 0; i < container.size(); i++) {
            for (int j = 0; j < container.get(i).size(); j++) {
                containerCapacity[i] += container.get(i).get(j);
                ballType[j] += container.get(i).get(j);
            }
        }
        for (int i = 0; i < container.size(); i++) {
            int j = 0;
            for (j = i; j < container.size(); j++) {
                if (containerCapacity[i] == ballType[j]) {
                    int temp = ballType[j];
                    ballType[j] = ballType[i];
                    ballType[i] = temp;
                    break;
                }
            }
            if (j == container.size()) {
                return "Impossible";
            }
        }
        return "Possible";
    }
}