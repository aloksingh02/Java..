package com.company;
import java.util.*;

public class CONDITIONAL_STATEMENT4 {

    public static void main(String[] args) {
        //display name of the day based on the number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = sc.nextInt();

        if(day==1)
        {
            System.out.println("it is monday");
        }
        else
        {
         if(day==2)
         {
             System.out.println("it is tuesday");
         }
         else
         {
          if(day==3)
          {
              System.out.println("it is wednesday");
          }
          else
          {
              if(day==4)
              {
                  System.out.println("it is thrusday");
              }
              else
              {
                 if(day==5)
                 {
                     System.out.println("it is friday");
                 }
                 else
                 {
                     if(day==6)
                     {
                         System.out.println("it is saturday");
                     }
                     else
                     {
                         if(day==7)
                         {
                             System.out.println("it is sunday");
                         }
                         else
                         {
                             System.out.println("it is invalid");
                         }

                     }
                 }
              }

              }
          }

        }
    }
}
