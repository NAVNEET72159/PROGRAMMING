package com.company;

import java.util.Scanner;

public class KLargest {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        KLargest obj = new KLargest();
        int T = scanner.nextInt();
        while (T!=0) {
            int N = scanner.nextInt();
            int arr[] = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }

            int C = scanner.nextInt();

            obj.Sort(arr, 0, N);
            //obj.Klargest(arr, N, C);
            T--;

            System.out.println("Sorted array: ");
            for (int i = 0; i<N; i++)
            {
                System.out.print(arr[i]+" ");
            }
        }

    }

    public static void Sort(int arr1[], int beg, int end) {
        int mid;
        if (beg>end) {
            mid = (beg+end)/2;
            Sort(arr1, beg, mid);
            Sort(arr1, mid+1, end);
            Merge(arr1, beg, mid, end);
        }
    }

    public static void Merge(int arr1[], int beg, int mid, int end) {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        /* temporary Arrays */
        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

        /* copy data to temp arrays */
        for (i = 0; i < n1; i++)
            LeftArray[i] = arr1[beg + i];
        for (j = 0; j < n2; j++)
            RightArray[j] = arr1[mid + 1 + j];

        i = 0; /* initial index of first sub-array */
        j = 0; /* initial index of second sub-array */
        k = beg;  /* initial index of merged sub-array */

        while (i < n1 && j < n2)
        {
            if(LeftArray[i] <= RightArray[j])
            {
                arr1[k] = LeftArray[i];
                i++;
            }
            else
            {
                arr1[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i<n1)
        {
            arr1[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j<n2)
        {
            arr1[k] = RightArray[j];
            j++;
            k++;
        }
    }

    // public static int[] Klargest(int[] arr1, int length, int count) {
        // int arr2[] = new int[count];
        //for (int i = 0; i<count; count++) {
            //arr2[i] = arr1[i];
        //}

        //return arr2;
    //}
}
