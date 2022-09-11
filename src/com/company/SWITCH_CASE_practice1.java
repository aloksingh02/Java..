package com.company;
import java.util.Scanner;

public class SWITCH_CASE_practice1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("==");
        System.out.println("ADD");
        System.out.println("SUBSTRACTION");
        System.out.println("MULTIPLICATION");
        System.out.println("DIVIDE");

        System.out.println("Enter 2 number");
        int x= sc.nextInt();
        int y= sc.nextInt();
        sc.nextLine();

        System.out.println("Enter option in word");
        String option=sc.nextLine();

        switch(option)
        {
            case "ADD":
                System.out.println("sum is"+(x+y));
                break;

            case"SUBSTRACTION":
                System.out.println("substraction is"+(x-y));
                break;

            case"MULTIPLICATION":
                System.out.println("multiply is"+(x*y));
                break;

            case"DIVIDE":
                System.out.println("divide is"+(x/y));
                break;
        }
    }
}
