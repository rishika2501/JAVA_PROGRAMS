package com.company.Basic;
import java.util.*;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int n1 = sc.nextInt();
        System.out.println("Enter num2");
        int n2 = sc.nextInt();

        int on1 = n1;
        int on2 = n2;

        while(n1%n2 != 0){
            int temp = n1%n2;
            n1 = n2;
            n2 = temp;
        }
        int gcd = n2;
        int lcm = (on1*on2)/gcd;


        System.out.println(gcd);
        System.out.println(lcm);







    }
}
