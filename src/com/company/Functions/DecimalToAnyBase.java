package com.company.Functions;
import java.util.*;

public class DecimalToAnyBase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number with base 10");
        int n = sc.nextInt();
        System.out.println("Enter new base ");
        int b= sc.nextInt();
        int f= decimalToBase(n,b);
        System.out.println(f);


    }
    public static int decimalToBase(int n, int b){
        int rv=0;
        int p=1;
        while(n>0){
            int dig = n%b;
            n= n/b;

            rv=rv+ dig*p;
            p*=10;

        }
        return rv;
    }
}
