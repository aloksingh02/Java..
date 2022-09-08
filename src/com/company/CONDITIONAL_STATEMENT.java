package com.company;

public class CONDITIONAL_STATEMENT {
    public static void main(String[] args)
    {
           int a=5 , b=10 , c=15;
        //1.Normal conditional
        //  System.out.println(a>b);
        //  System.out.println(a<b || a<c);
        //int a=-5;

        //if (a>0)
        //{
        //    System.out.println("positive");
        //}
        //else
        //{
        //    System.out.println("negative");
        //}

        //2.Nested conditional
        if (a>b && a>c)
        {
            System.out.println(a);
        }
        else if(b>c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
}
