package com.company;

public class STRING_METHOD {
    public static void main(String[] args)
    {
        //1.FOR LENGTH
        String str = new String("    netbeans    ");
        //it return value integer
        //System.out.println(str.length());

        //2.FOR UPPER CASE
        //we get upper case in other references like input is in str1 but we get in str2
        //String str2=str.toUpperCase();
        //System.out.println(str2);

        //3.FOR LOWER CASE
       // String str3 = str.toLowerCase();
        //System.out.println(str3);

        //4.FOR TRIM
        //str = str.trim();
        //System.out.println(str);

        //5.Substring
        //String str2 = str.substring(3,7);
        //System.out.println(str2);

        //REPLACE METHOD
        String str2=str.replace('e','z');
        System.out.println(str2);

    }
}
