package Packages.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[][]arr = new int[3][3];

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            arr[i][j] = input.nextInt();
        }
    }
      for (int j = 0; j < arr.length; j++) {
        System.out.println(Arrays.toString(arr[j]));
      }
    

    int target = input.nextInt();

    System.out.println(search(arr, target));
 }

    static boolean search(int[][]arr, int target){

        if(arr.length==0){
            return false;
        }

        for (int index = 0; index < arr.length; index++) {
             for (int i = 0; i < arr[index].length; i++) {
                if(arr[index][i]==target){

                    return true;
                }
             }
        } 
            
        return false;
    }
}
