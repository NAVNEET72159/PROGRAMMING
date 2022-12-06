package CodeChefQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class STFRN {
    public static void main(String[] args) {

        ArrayList list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            list.add(num);
        }

        System.out.print(list);
    }
}