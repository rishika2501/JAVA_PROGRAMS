package com.company.Basic;
import java.util.*;
public class InverseOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();


        int inv =0;
        int op =1;  //old position
        while(num != 0){
             int od = num%10;
             int id = op; //nd = new digit , op = old position
             int ip = od; //np = new digit , od = old digit

            inv = inv + id * (int)Math.pow(10, ip - 1);

            num = num/10;
            op++;




        }
        System.out.println(inv);
    }
}
