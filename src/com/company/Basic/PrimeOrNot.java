//WAP to check whether a number is prime or not
package com.company.Basic;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number(integer only)");
        int num = sc.nextInt();

        int count=0;//stores the number of divisors of the entered number
        for(int div=2;div*div<=num;div++){
            if(num%div==0){ //means that the entered number is completely divisible
                count++;
                break;
            }
        }
        if(count==0){
                System.out.println("The number is prime");
            }
            else
                System.out.println("The number is not prime");
        }

    }

