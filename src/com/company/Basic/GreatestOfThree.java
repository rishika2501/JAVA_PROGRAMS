//WAP to find the greatest of three numbers
package com.company.Basic;
import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number");
        int num3 = sc.nextInt();
        if(num1>num2 && num2>num3){
            System.out.println("Greatest of all is" + num1);

        }
        else if(num2>num1 && num2>num3){
            System.out.println("Greatest of all is " + num2);
        }
        else{
            System.out.println("Greatest of all is " + num3);
        }


    }
}
