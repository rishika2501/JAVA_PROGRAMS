package com.company.Basic;
import java.util.*;
public class PrimeF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();


        for(int div=2; div*div <= num;div++){
            while(num%div ==0){
                num = num/div;
                System.out.println(div);
            }


        }

        if(num !=1){
            System.out.println(num);
        }

    }
}
