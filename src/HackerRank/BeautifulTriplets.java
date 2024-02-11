package HackerRank;

import java.util.HashMap;
import java.util.List;

public class BeautifulTriplets {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 4, 5, 7, 8, 10);
        int d = 3;
        System.out.println(beautifulTriplets(d, arr));
    }
    public static int beautifulTriplets(int d, List<Integer> arr) {
        int count=0;
        HashMap<Integer,Integer> map=getMap(arr,arr.size());
        for(int i=0;i<arr.size();i++){
            int secondObject=arr.get(i)+d;
            Object j=map.get(secondObject);
            if(j!=null){
                int thirdObject=secondObject+d;
                Object k=map.get(thirdObject);
                if(k!=null){
                    if((int)k>(int)j && (int)j>i)
                        count++;
                }
            }
        }
        return count;
    }
    public static HashMap<Integer,Integer> getMap(List<Integer> list, int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
            map.put(list.get(i),i);
        System.out.println(map);
        return map;
    }
}
