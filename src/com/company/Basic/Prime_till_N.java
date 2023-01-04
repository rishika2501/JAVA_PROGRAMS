package com.company.Basic;
import java.util.Scanner;
public class Prime_till_N {
    public static void main(String[] args)

        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the starting value");
            int up_val = sc.nextInt();
            System.out.println("Enter the ending value");
            int lo_val = sc.nextInt();

            for (int n = lo_val; n <= up_val; n++) {  //outer loop to print the numbers within the given range
                int count = 0;
                for (int div = 2; div * div <= n; div++) { //checking the numbers within the given range
                    if (n % div == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    System.out.println(n);
                }
            }


        }

    }

