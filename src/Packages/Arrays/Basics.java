package Packages.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Basics {
 public static void main(String[] args) {
    int[] arr = {1,4,6,8,9};
    
    Scanner input = new Scanner(System.in);
    System.out.println("Provide the size of array"); 
    int size = input.nextInt();
    int[] arr1 = new int[size];
    for(int i =0; i<size;i++ ){
        arr1[i] = input.nextInt();
    }
  
    // for(int i =0; i<size;i++ ){
    //     System.out.print(arr1[i] +" ");
    // }

    // for(int i : arr1){

    //     System.out.print(i +" ");
    // }
    System.out.println(Arrays.toString(arr1));
 }
}
