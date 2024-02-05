package LeetCodePracticeQuestions;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }
    public static int firstUniqChar(String s) {
        int index = -1;
        for(int i = 0; i < s.length(); i++) {
            int count = 0;
            System.out.println(s.charAt(i) + " " + i);
            for(int j = 0; j < s.length(); j++){
                System.out.println(s.charAt(j) + " " + j);
                if(s.charAt(i) == s.charAt(j) && i != j)
                    count++;
                System.out.println(count);
            }
            if(count == 0){
                index = i;
                break;
            }
        }
        return index;
    }
}
