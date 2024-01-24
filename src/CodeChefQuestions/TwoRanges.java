package CodeChefQuestions;

import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TwoRanges {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            Map<Integer, Integer> map = new Map<Integer, Integer>() {
                @Override
                public int size() {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public boolean containsKey(Object key) {
                    return false;
                }

                @Override
                public boolean containsValue(Object value) {
                    return false;
                }

                @Override
                public Integer get(Object key) {
                    return null;
                }

                @Override
                public Integer put(Integer key, Integer value) {
                    return null;
                }

                @Override
                public Integer remove(Object key) {
                    return null;
                }

                @Override
                public void putAll(Map<? extends Integer, ? extends Integer> m) {

                }

                @Override
                public void clear() {

                }

                @Override
                public Set<Integer> keySet() {
                    return null;
                }

                @Override
                public Collection<Integer> values() {
                    return null;
                }

                @Override
                public Set<Entry<Integer, Integer>> entrySet() {
                    return null;
                }
            };
            
        }
    }

}
