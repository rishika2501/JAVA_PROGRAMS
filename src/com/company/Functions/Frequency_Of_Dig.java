package com.company.Functions;
import java.util.*;

public class Frequency_Of_Dig {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println("Enter d");//digit whose frequency should be matched
        int d = sc.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println("The frequncy of "+ d +" is "+ f);
    }

    public static int getDigitFrequency(int n, int d){
         int rv=0; //rv=return value
        while(n>0){
            int dig = n%10;
            n=n/10;
            if(dig == d){
                rv++;
            }

        }

        return rv;
    }
}
