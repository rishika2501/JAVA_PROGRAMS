package com.company.Pattern;
import java.util.*;
public class Pattern03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int num = sc.nextInt();

        int sp=num-1;
        int str = 1;
        for (int i=1;i<=num;i++){
           // System.out.println(sp+" "+str);
            for(int j=1;j<=sp;j++) {
                System.out.print(" \t");
            }

            for(int j=1;j<=str;j++){
                    System.out.print("*\t");
            }

            sp--;
            str++;
            System.out.println();
        }



    }
}
