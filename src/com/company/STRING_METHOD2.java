package com.company;

public class STRING_METHOD2 {
    public static void main(String[] args) {

        //8.startsWith()
        String str1 = "Mr Shahrukh khan";
        //System.out.println(str1.startsWith("Mr"));
        //System.out.println(str1.startsWith("mr"));


        //9.endWith() In this we find the is the char ending with give or not return out as   T/F
        //System.out.println(str1.endsWith("khan"));
        //System.out.println(str1.endsWith("shah"));


        //10.charAt() It is use to find the char by giving the char index number  simply return the output
        //System.out.println(str1.charAt(6)); and it will not contain any inverted commas
        //System.out.println(str1.charAt(7));

        //11.indexOf() We find the index(what is the index number that char belong to)  return the value
        //System.out.println(str1.indexOf("h"));
        System.out.println(str1.indexOf("khan"));

        //12. int.lastIndexOf
        System.out.println(str1.lastIndexOf("k"));

    }
}
