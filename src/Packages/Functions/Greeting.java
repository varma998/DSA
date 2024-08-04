package Packages.Functions;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       String in = input.next();
        String Ans = greet(in);

       System.out.println(Ans);
    }


    static String greet(String in){
         String value = "Hello"+ in;
         return value;
         
    }
}
