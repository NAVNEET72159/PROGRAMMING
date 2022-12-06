package com.company;

public class SelectionSort {


    public static void Selection(int arr[])
    {
        int index;
        for (int i=0; i< arr.length; i++)
        {
            index = i;
            for (int j=i+1;j< arr.length;j++)
            {
                if (arr[index]>arr[j])
                {
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String args[])
    {
        int arr1[] = {9, 14, 32, 43, 11, 58, 22};
        System.out.println("Before Selection Sort.");
        for (int i : arr1)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        Selection(arr1);
        System.out.println("After Selection Sort.");
        for (int i : arr1)
        {
            System.out.print(i+" ");
        }
    }
}
