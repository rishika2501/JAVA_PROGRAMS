package com.company.Pattern;
import java.util.*;

public class Pattern07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        int str=1;
        int sp=0;
        for(int i=1;i<=n;i++){
           // System.out.println(sp + ","+ str);
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=str;j++){
                System.out.print("*\t");
            }
            sp++;
            System.out.println();
        }
    }
}
