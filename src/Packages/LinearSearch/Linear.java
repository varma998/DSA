package Packages.LinearSearch;

import java.util.Scanner;

public class Linear {
 public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int target = input.nextInt();
    int[]arr = new int[7];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = input.nextInt();
    }

   int value = linearSearch (arr , target);
   System.out.println(value);

 }
 static int linearSearch (int[]arr , int target){

   if(arr.length <= 0){
    return -1;
   }
   
    // for (int i = 0; i < arr.length; i++) {
        
    //     if(arr[i]==target){

    //         return i;
    //     }
    //}

     for (int i : arr) {
        if(i == target){

            return i;
        }
     }



     return -1;
 }

}
