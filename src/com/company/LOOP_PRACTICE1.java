package com.company;
import java.util.*;

public class LOOP_PRACTICE1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        int rev=0,r;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;

            System.out.println("reverse of a number:"+rev);
        }



    }
}
