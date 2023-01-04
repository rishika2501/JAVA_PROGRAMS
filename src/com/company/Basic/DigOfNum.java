package com.company.Basic;
import java.util.Scanner;

public class DigOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int dig=0;
        int temp=num; //temp is the temporary variable
        while(temp!=0){
            temp=temp/10;
            dig++;
        }

        int div = (int)Math.pow(10, dig-1);
        while(div!=0){  //divisor has the major role to play
            int q=num/div;
            System.out.println(q);

            num=num%div; //*
            div=div/10;  //*




        }

        
    }
}
