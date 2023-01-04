//WAP to check whether a number is positive or negative

package com.company.Basic;

import java.util.Scanner;

public class PositiveOrNegative {



        public static void main(String[] args) {
            System.out.println("Enter the number to be checked(only integer)");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();//reads a number from the keyboard
            if(num==0){
                System.out.println("You have entered Zero");
            }
            else if(num<0){
                System.out.println("Negative number");
            }
            else{
                System.out.println("Positive number");
            }

        }

}
