package HackerRank;

import java.util.List;

public class AcmIcpcTeam {
    public static void main(String[] args) {
        List<String> topic = List.of("10101", "11100", "11010", "00101");
        System.out.println(acmTeam(topic));
    }
    public static List<Integer> acmTeam(List<String> topic) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < topic.size() - 1; i++) {
            for (int j = i + 1; j < topic.size(); j++) {
                int temp = 0;
                for (int k = 0; k < topic.get(i).length(); k++) {
                    if (topic.get(i).charAt(k) == '1' || topic.get(j).charAt(k) == '1') {
                        temp++;
                    }
                }
                if (temp > max) {
                    max = temp;
                    count = 1;
                } else if (temp == max) {
                    count++;
                }
            }
        }
        return List.of(max, count);
    }
}
