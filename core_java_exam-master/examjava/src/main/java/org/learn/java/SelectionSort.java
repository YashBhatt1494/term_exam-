package org.learn.java;

public class SelectionSort {
	static void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int temp = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[temp])
                    temp = j;
            
            int tempSwap = arr[temp];
            arr[temp] = arr[i];
            arr[i] = tempSwap;
        }
    }
 

    public static void main(String args[])
    {
        int arr[] = {6,36,1,2,79};
        sort(arr);
        for(int i : arr)
        System.out.println(i);
        
    }

}
