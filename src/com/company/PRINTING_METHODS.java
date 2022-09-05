package com.company;

public class PRINTING_METHODS {
    public static void main(String[] args)
    {
        //1.
        // int  x=656;
        //float y= 54.226f;
        //char z ='A';
        //now if print here sysstem is standard thing and  .out is the static thing
        // when we see the method of print we see print=it simply print ,println=it print and take you on the next line
        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(a+b);
        //here int sout we add a+b which is one thing
        //what if in sout(a,b) it is two thing

        //System.out.println("the number is");
        //if we want to print the byte b then just add +b after " which simple concetinate b with the number like given below
        //System.out.println("the number is " +b);

        //System.out.println(a+b+"sum");
        //System.out.println("sum"+a+b);
        //these two are differ from each other its all about the concetination
        //to get your useful result USE PRECEDENCE

        //2.
        //Now the other way method of printing is PRINTF (it allow you to take out put in single line)
        //int a = 12;
        //float b = 1244.5445f;
        //char c = 'A';
        //String str="alok kumar singh";
        //System.out.printf("%1$d %1$d %1$d",a);
        //if we replace d by o then it show the value of octal
        //if we replace d by x then it show the value of hex it mean that it in hex it is 'A'

        //3.
        //format specifier
        //%[argument_index$][flags][width][.precision]conversion
        //argument index-1$,2$,3$...
        //flag'-','+','0','','('
        //convergence-
        //char  c
        //int  d,o,x     d=decimal,o=octal,x=hex
        //float f,e,g    e=scientific representation(exponential) ,
        //string s


        //4.for getting output in your pattern we use (%1$d) here you can replace your d by your datatype given below
        //its all about giving the index
        int a=456;
        float b=14.55f;
        char  c= 'A';
        String str= "alok singh";
        System.out.printf("%3$s,%2$f,%1$d",a,b,str );



    }
}
