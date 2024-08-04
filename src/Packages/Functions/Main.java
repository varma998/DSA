package Packages.Functions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first number");

    int a= input.nextInt();

    System.out.println("Enter the Second number");

    int b = input.nextInt();
     int Ans = sum(a,b);
     System.out.println("The Answer is "+Ans);

    }

  static int sum (int a, int b){


    int sum = a +b;

    return sum;

   }

}
