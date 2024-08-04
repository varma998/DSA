package Packages.Sortings;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
      int[] arr ={3,13,7,56,67,34,29};
      System.out.println(Arrays.toString(bubble(arr)));
    }

    static int[] bubble (int[]arr){
        boolean swapped = false;
        for(int i=0 ; i< arr.length;i++){

            for(int j=1; j< arr.length-i; j++){

                if(arr[j]< arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;
                   swapped =true;
                }
            }

            if(!swapped){
                return arr;
            }
        }

     return arr;

    }
}
