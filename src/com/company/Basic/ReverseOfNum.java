package com.company.Basic;
import java.util.Scanner;
public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        while(num>0){
            int dig = num%10; //dig stores the remainder
            num = num/10; //reducing the number
            System.out.println(dig);
        }



        }



    }

