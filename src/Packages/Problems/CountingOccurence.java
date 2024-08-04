package Packages.Problems;

import java.util.Scanner;

public class CountingOccurence {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int num = input.nextInt();
       int value = input.nextInt();
       int count =0;
       while(num>0){
          int val = num %10;
          if(val == value){
            count++;
          }
          num= num/10;
       }
       
       System.out.println(count);
    }
}
