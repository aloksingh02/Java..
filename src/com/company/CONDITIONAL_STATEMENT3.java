package com.company;
import java.util.*;

public class CONDITIONAL_STATEMENT3 {
    public static void main(String[] args)
    {
     Scanner scan = new Scanner(System.in);

        System.out.println("enter the year");
       int year = scan.nextInt();

        if(year%4==0)
        {
            if(year%100==0)
            {
                if (year%400==0)
                {
                    System.out.println("yes it is leap year");
                }
                else

                    System.out.println("No it is not a leap year");
                }
                else

                    System.out.println("yes it is a leap year");
                }
                else
                {
                    System.out.println("No its not a leap year");

                }
        }

}
