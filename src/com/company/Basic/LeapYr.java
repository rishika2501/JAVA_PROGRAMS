//WAP to find whether the entered year is leap year or not
package com.company.Basic;
import java.util.Scanner;

public class LeapYr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int yr = sc.nextInt();
        if(yr%4==0){
            System.out.println("LEAP YEAR!");
        }
        else {
            System.out.println("not LEAP YEAR");
        }

    }
}
