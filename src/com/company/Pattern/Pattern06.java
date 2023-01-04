package com.company.Pattern;
import java.util.*;
public class Pattern06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any odd number");
        int n = sc.nextInt();

        int sp=1;
        int str=(n/2)+1;
        for(int i=1;i<=n;i++){
           // System.out.println(str+" ,"+sp +", "+str);
            for(int j=1;j<=str;j++){
                System.out.print("*\t");
            }
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=str;j++){
                System.out.print("*\t");
            }

            if(i<=n/2){
                str--;
                sp=sp+2;
            }
            else{
                str++;
                sp=sp-2;
            }
            System.out.println();
        }
    }
}
