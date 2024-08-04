package Packages.Problems;

import java.util.Scanner;

public class Charectercase {
public static void main(String[] args) {
   Scanner input  =  new Scanner(System.in);
  char value  = input.next().trim().charAt(0);

  if (value >= 'a' && value<='z'){

    System.out.println("Lowe Case");
  }
  else{

    System.out.println("Upper Case");
  }
    
}
}
