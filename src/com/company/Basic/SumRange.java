//WAP to find the sum of numbers in a given range
package com.company.Basic;
import java.util.Scanner;

public class SumRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number of the range");
        int s = sc.nextInt();
        System.out.println("Enter the ending number of the range");
        int e = sc.nextInt();
        int sum = 0;
        for(int i=s; i<=e; i++){
            sum = sum+i;
        }
        System.out.println("The sum of the numbers lying within the range "+ s + " to " + e + " is " +  sum);
    }
}
