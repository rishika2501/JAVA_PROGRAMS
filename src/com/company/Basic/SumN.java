//WAP to sum first N natural numbers
package com.company.Basic;
import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N = sc.nextInt();//reads N as input
        //int sum = (N*(N+1))/2;
        int sum = 0;
        for(int i=1;i<=N;i++){
            sum += i;

        }
        System.out.println("Sum of N natural numbers is "+ sum);
    }
}
