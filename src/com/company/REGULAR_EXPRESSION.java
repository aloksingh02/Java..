package com.company;

public class REGULAR_EXPRESSION {
    public static void main(String[] args) {
        //String str1 = "6";
        //String str1 = "g";
        //String str1 = "$";
        //System.out.println(str1.matches("."));

        //String str1 = "abc";
        //String str1 = "a";
        //String str1  = "ab";
        //String str1 = "D7";
        //System.out.println(str1.matches("[abc]"));
        // not
        // System.out.println(str1.matches("^abc"));

        //System.out.println(str1.matches("[a-z0-9]"));
        //now here it allowed the range of a to z and 0 to 9

        //but notice that if we give the value of A OR ANY CAPITAL ALPHABET THEN WE ALSO HAVE TO ALLOW THE A-Z LIKE GIVEN BELOW
        //System.out.println(str1.matches("[a-z0-9A-Z]"));

        //WE CAN ALSO GIVE MULTIPLE ALPHABET
        //System.out.println(str1.matches("[A-Z][0-9]"));

        //META DATA
        String str1 = "$";
        System.out.println(str1.matches("\\W"));
        //System.out.println(str1.matches("\\D"));





    }
}
