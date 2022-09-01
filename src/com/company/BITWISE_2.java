package com.company;

public class BITWISE_2 {
    public static void main(String[] args)
    {
        // SWAPPING OF THE NUMBER IN THIS WE USE X0R
        //int a=10;
        //int b=15;
        //a=a^b;
        //b=a^b;
        //a=a^b;
        //System.out.println(a+" "+b);

        //TAKING BYTE TYPE VARIABLES INSIDE C
        //byte a=9,b=12;
        //byte c;

        //c=(byte)(a<<4);
        //c=(byte)(c|b);

        //System.out.println((c&0b11110000)>>4);
        //System.out.println((c&0b00001111));

        //IF THERE ARE ONLY 2 BYTE THEN WE CAN DIRECTLY PUT IN CODE

        byte c;
        c=(byte)(9<<4);
        c=(byte)(c|12);

        System.out.println((c&0b11110000)>>4);
        System.out.println((c&0b00001111));


    }
}
