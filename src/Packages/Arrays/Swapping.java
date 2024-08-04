package Packages.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Swapping {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

     int []arr = new int[5];
     System.out.println("Enter the values");
     for (int i = 0; i < arr.length; i++) {
        arr[i] = input.nextInt();
     }

     int start = 0;
     int end = arr.length-1;
      reverse(arr , start , end);
     System.out.println(Arrays.toString(arr));
 }

//    static void swap(int[]arr , int index1 , int index2){
//     int temp = arr[index1];
//     arr[index1] = arr[index2];
//     arr[index2] = temp;

//    }
  static void reverse(int[]arr , int start, int end){
  while (start<end){
   int temp = arr[start];
   arr[start] = arr[end];
   arr[end] = temp;
   start++;
   end--;
  }

  }


}
