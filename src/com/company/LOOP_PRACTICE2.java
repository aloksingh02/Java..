package com.company;
import java.util.*;
public class LOOP_PRACTICE2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        //displaying digit of a number
        //remember before appling any loop you must introduce the variable like in below
        //long count = 0;

        //while(n>0)
        //{
            //1.display the digit
            //r=n%10;
            //n=n/10;
            //
            // System.out.println(r);


            //2.Count any number
            //n=n/10;
            //count++;
            //System.out.println("count of number is:"+count);


            //3.FIND THE NUMBER IS ARMSTRONG OR NOT
            // IF CUBE OF A NUMBER OF ANY DIGIT IS ADDED AND RETURN same


        //}
        int m=n;
        int sum=0;
        int r;
        while(n>0)
        {
            r=n%10;
            n=n/10;

            sum=sum+r*r*r;

        }
        if(sum==m)
            System.out.println("Its a armstrong number");
        else
            System.out.println("Its not a armstrong number");




    }
}
