package Coding_Ninja_Programming;

import java.util.Scanner;

public class operationInJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        System.out.println("Enter the array element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        //Traversing
        System.out.println("Elements in array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        insertion(n);
    }
    public static void insertion(int n) {
        int[] arr = new int[n+1];
        int pos, x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array element before insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        pos = 3;
        x = 24;
        for (int i = (n-1); i >= (pos-1); i--) {
            arr[i+1] = arr[i];
        }
        arr[pos-1] = x;
        System.out.println("Array elements after insertion: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        deletion(arr, n);
    }
    public static void deletion(int[] arr, int n) {
        System.out.println("Array elements before deletion: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int x = 24, flag = 1, loc = 0;
        for (int i = 0; i <= n; i++) {
            if (arr[i] == x) {
                loc = i;
                break;
            } else {
                flag = 0;
            }
        }
        if (flag == 1) {
            for (int i = loc+1; i <= n; i++) {
                arr[i-1] = arr[i];
            }
            System.out.println("Array elements after deletion: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        } else {
            System.out.println("Element not found.");
        }
        System.out.println();
        searching(arr, n);
    }
    public static void searching(int[] arr, int n) {
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int searching_ele = 3, flag = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == searching_ele) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Element found.");
        } else {
            System.out.println("Element not found.");
        }
        System.out.println();
        updating(arr, n, searching_ele);
    }
    public static void updating(int[] arr, int n, int search_ele) {
        System.out.println("Array Elements are: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the element to be updated: ");
        int x = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == search_ele) {
                arr[i] = x;
                break;
            } else {
                System.out.println("Element not found.");
            }
        }
        System.out.println("Updated array element are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}