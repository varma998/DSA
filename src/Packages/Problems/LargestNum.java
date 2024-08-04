package Packages.Problems;

import java.util.Scanner;

public class LargestNum {
 public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int a= input.nextInt();
    int b =input.nextInt();
    int c =input.nextInt();

    int max = 0;

    if(a>b){
        max=a;
    }else{
        max=b;
    }

    if(c>max){
        max=c;
    }

    System.out.println(max);
 }
}
