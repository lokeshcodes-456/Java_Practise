package Sorting;

import java.util.*;

public class bubbleSort {
    public static int[] sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={2,1,9,7,4,3};
        arr=sort(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));
        sc.close();
    }
}
