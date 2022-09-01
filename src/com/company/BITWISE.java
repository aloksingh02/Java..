package com.company;

public class BITWISE {
    public static void main(String[] args) {
        //'AND' OPERATION
        //1.int a=10;
        //int b=6;
        //int c=a&b;
        //System.out.println(c);

        //2.int a=565,b=9559,c;
        //c=a&b;
        //System.out.println(c);

        //well we can find any it in this ways
        //we also know that integer can be initialize by binary number also so we take other ways

        //3.int a=0b1010;
        //int b=0b110;
        //int c=a&b;
        //System.out.println(c);

        //'OR' OPERATION = HERE ALL THING IS SAME ONLY OPERATION WILL BE CHANGE ALSO SIGH
        //int a = 22;
        //int b = 45;
        //int c = a|b;
        //System.out.println(c);

        //'XOR' OPERATION
        //int a = 56;
        //int b = 98;
        //int c = a^b;
        //System.out.println(c);

        //LEFT SHIFT
        //int a = 0b1010;
        //int y= a<<1;
        //System.out.println(y);

        //int a = 0b110;
        //int b =a<<1;
        //System.out.println(b);

        //int a = 0b110;
        //int b = a<<2;
        //System.out.println(b);

        //'RIGHT SHIFT' shifting without signbit
        //int a = -0b1010;
        //int b = a>>1;
        //System.out.println(b);

        //bit pattern of y
        //int a =-0b1010;
        //int b;
        //b=a>>1;
        //System.out.println(String.format("%5",Integer.toBinaryString(b)));

        // 'NOT' OPERATION
        int a=0b1010;
        int b=~a;
        System.out.println(b);
    }
}
