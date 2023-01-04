package com.company.Functions;
import java.util.*;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Base of the entered number");
        int b = sc.nextInt();

        int f = anyBaseToDecimal(n, b);
        System.out.println(f);

    }
    public static int anyBaseToDecimal(int n, int b){
        int rv=0;
        int p=1;
        while(n>0){
            int dig = n%10;
            n=n/10;
            rv = rv + dig*p;
            p = p*b; //power will increase base times
        }
        return rv;
    }
}
