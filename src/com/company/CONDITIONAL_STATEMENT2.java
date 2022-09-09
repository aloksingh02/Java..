package com.company;
import java.util.*;

public class CONDITIONAL_STATEMENT2 {
    public static void main(String[] args) {

        //finding the radix of the string
        //condition are
        //10101010 = binarynumber
        //0-7 = octal radix
        //A25B = HEXA RADIX
        //1232456987 = DECIMAL NUMBER
        Scanner sc= new Scanner(System.in);
        String num;
        System.out.println("enter the number");
        num=sc.nextLine();

        if(num.matches("[01]+"))
        {
            System.out.println("binary radix = 2");
        }
        else
        {
            if(num.matches("[0-7]+"))
            {
                System.out.println("Octal radix = 8");
            }
            else
            {
                if(num.matches("[0-9]"))
                {
                    System.out.println("decimal number");
                }
                else
                {
                    if(num.matches("[0-9A-F]+"))
                    {
                        System.out.println("HEXA RADIX =16" );
                    }
                    else
                    {
                        System.out.println("it is not a number");
                    }
                }
            }
        }


    }
}
