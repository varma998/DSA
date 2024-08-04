package Packages.Problems;

import java.util.Scanner;

public class Fibbnoci {
 public static void main(String[] args) {
    
    Scanner input  = new Scanner(System.in);

   int num = input.nextInt();

   int a = 0;
   int b= 1;
   int count = 2;

   while(count<=num){
     int temp = b;
     b= b+a;
     a= temp;
      count++;
 }
 System.out.println(b);
 
 }

}
