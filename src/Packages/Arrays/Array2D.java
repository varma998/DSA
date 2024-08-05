package Packages.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[][] arr = new int[3][2];

    // input is given fo testing purpose:

    for (int row = 0; row < arr.length; row++) {
         for(int col =0; col< arr[row].length; col++){

            arr[row][col] = input.nextInt();
          //3
         }
    }

//     for (int row = 0; row < arr.length; row++) {
//         for(int col =0; col< arr[row].length; col++){

//            System.out.print( arr[row][col] +" " );
           
//         }
//         System.out.println();
//    }

     for (int[] a : arr) {
         System.out.println(Arrays.toString(a));
     }

 }
}
