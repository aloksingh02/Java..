package com.company;
import java.util.Scanner;

public class CONDITIONAL_STATEMENT1 {
    public static void main(String[] args) {
       /* int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        n=sc.nextInt();
        if (n%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }*/
       /* int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        age=sc.nextInt();

        if(age>=14 && age<=55)
        {
            System.out.println("yes it is young");
        }
        else
        {
            System.out.println("no it is not young");
        }*/

        int m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 3 Subject");
        m1= sc.nextInt();
        m2= sc.nextInt();
        m3= sc.nextInt();

        float avg=(float)(m1+m2+m3)/3;
        if(avg>=70)
        {
            System.out.println("grade a");
        }
        else if (avg>=60 && avg<=70)
        {
            System.out.println("grade b");
        }
        else if(avg>=50 && avg<=60)
        {
            System.out.println("grade c");
        }
        else if(avg>=40 && avg<=50)
        {
            System.out.println("grade d");
        }
        else
        {
            System.out.println("grade e");

        }
    }
}
