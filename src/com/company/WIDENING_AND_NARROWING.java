package com.company;

public class WIDENING_AND_NARROWING {
    public static void main(String[] args)
    {
        byte b=10;
        short s=5;
        int i=10;
        double d=10;
        float f=10;
        long l=10;
        char c=10;
        boolean bl=true;

       //s=b;
       //i=b;
       //l=b;
       //f=b;
       //l=b;
       //character not assign byte

        b=(byte)s;//it cannot assign if and only if it follow the narrowing
        i=s;
        l=s;
        f=s;
        d=s;
        System.out.println(b);
        //HERE WIDENING MEAN YOU CAN SAYS THAT CONVERSION/TRANSFERING OF THE SMALL OF LESS SIZE OF DATATYPE IN LARGE ONE
        // IN THIS IF WIDENING OF DATATYPE NOT TAKE PLACE THAN WE USE THE NARROWING.




    }
}
