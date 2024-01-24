package CodeChefQuestions;

import java.util.Scanner;

class Abhinav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        System.out.println("enter the array values");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean flag = checkPowerofTwo(arr[i]);
            if (flag == true)
                count++;
        }
        System.out.println(count);
    }

    public static boolean checkPowerofTwo(int x)
    {
        if (x == 0)
            return false;
        while( x != 1)
        {
            if(x % 2 != 0)
                return false;
            x /= 2;
        }
        return true;
    }

}
