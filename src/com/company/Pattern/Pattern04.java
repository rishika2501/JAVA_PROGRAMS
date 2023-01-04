package com.company.Pattern;
import java.util.*;
public class Pattern04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int str=num;
        int sp=0;

        for(int i=0;i<=num;i++){
           // System.out.println(sp + "," +str);
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=str;j++){
                System.out.print("*\t");
            }
            sp++;
            str--;
            System.out.println();
        }




    }
}
