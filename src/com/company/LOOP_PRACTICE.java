package com.company;
import java.util.*;

public class LOOP_PRACTICE {
    public static void main(String[] args) {
       //REMEMBER ONE THING THAT IF IN ANY QUESTION IT ASKED TO CREATE ENVIRONMENT IT SIMPE MEANS FOR TO IMPORT SCANNER
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        //for(int i=1; i<=10; i++)
        //{
        //    System.out.println(n+"x"+i+"="+n*i);
       // }


        //SUM OF THE first n NUMBER


       // int sum=0;
        //for(int i=1;  i<=n; i++)
       // {
         //   sum=sum+i;
        // }
        //System.out.println("Sum of "+n+" Number is "+sum);
        long fact = 1;
        for(int i=1;i<=n;i++)
        {
              fact=fact*i;
        }
        System.out.println("factorial is :" +fact);

    }
}
