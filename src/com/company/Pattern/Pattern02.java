package com.company.Pattern;
import java.util.*;

public class Pattern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j = 5; i<=j; j--){ //printing the required number of stars in each row
                System.out.print(" * ");
            }
            System.out.println(); //changes the line

        }

    }
}
