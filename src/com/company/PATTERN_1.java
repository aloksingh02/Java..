package com.company;

public class PATTERN_1 {
    public static void main(String[] args) {
        //5.
        // 1
        // 12
        // 123
        // 1234
        // 12345

        //for(int i=1; i<=5; i++)
        //{
          //  for(int j=1; j<=i; j++)
            //{
              //  System.out.print(j+" ");

            //}
            //System.out.println("");
        //}
//----------------------------------------------------------------------------------------------------------------------
        //6.
        //1
        //23
        //456
        //78910
        //1112131415

        //int count=0;
        //for(int i=1; i<=5; i++)
        //{
         //   for(int j=1; j<=i; j++)
           // {
             //   ++count;
               // System.out.print(count +" ");
            //}
            //System.out.println("");
            //and for star replace count with * in given form
//----------------------------------------------------------------------------------------------------------------------
            //2.
            //12345
            //1234
            //123
            //12
            //1
        int count=0;

            for(int i=1; i<=5; i++ )
            {
                for(int j=1; j<=5-i+1; j++)
                {
                    count++;
                    //System.out.print(j+" ");
                    //System.out.print(i);
                    //System.out.print("* ");
                    //System.out.print(count+" ");
                    
                }
                System.out.println("");
            }

    }
}
