package com.company;
import java.lang.*;
import java.util.Scanner;


public class ARITHMATIC_2 {
    public static void main(String[] args)
     {
        // float base,height,area;
        // System.out.println(" ENTER THE BASE AND HEIGHT OF TRIANGLE ");

        // Scanner sc = new Scanner(System.in);
        // base = sc.nextFloat();
        // height = sc.nextFloat();

        // area=(base*height)/2;
        // System.out.println("THE AREA OF TRIANGLE IS :" +area);



         // if three differ side is given and then we have to find the area of triangle
         Scanner sc = new Scanner(System.in);
        int a,b,c;
        float s;
        double area;


         System.out.println("Enter the 3 side of triangle ");

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        s= (a+b+c)/2f;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
         System.out.println("Area is :" +area);


     }


}
