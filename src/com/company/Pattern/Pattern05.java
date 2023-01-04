package com.company.Pattern;
import java.util.*;

public class Pattern05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any odd number");
        int n = sc.nextInt();

        int sp=n/2;
        int str=1;

        for(int i=1;i<=n;i++){
            //System.out.println(sp + " "+str);

            for(int j =1;j<=sp;j++){
                System.out.print("\t");

            }

            for(int j =1; j<=str;j++){
                System.out.print("*\t");

            }

            if(i<=n/2){
                sp--;
                str +=2;

            }
            else{
                sp++;
                str -=2;
            }

            System.out.println();
        }
    }
}
