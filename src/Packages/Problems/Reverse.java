package Packages.Problems;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int revNum =0;

        while(num>0){
            int value =num%10;

            revNum= revNum*10+value;
            num=num/10;
        }
        System.out.println(revNum);
    }
}
