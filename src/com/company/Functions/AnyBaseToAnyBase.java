package com.company.Functions;
import java.util.*;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter first base");
        int b1= sc.nextInt();
        System.out.println("Enter second base");
        int b2 = sc.nextInt();
        int n1 = anyBaseToDecimal(n, b1);
        int n2 =decimalToBase(n1, b2);
        System.out.println(n2);;

    }
    //basic idea is to change the number to decimal base and then convert it to the required new base
    public static int anyBaseToDecimal(int n, int b1){
        int rv=0;
        int p=1;
        while(n>0){
            int dig = n%10;
            n=n/10;
            rv = rv + dig*p;
            p = p*b1; //power will increase base times
        }
        return rv;
    }
    public static int decimalToBase(int n1, int b2){
        int rv=0;
        int p=1;
        while(n1>0){
            int dig = n1%b2;
            n1= n1/b2;

            rv=rv+ dig*p;
            p*=10;

        }
        return rv;
    }

}
