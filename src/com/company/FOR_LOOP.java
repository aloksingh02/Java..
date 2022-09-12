package com.company;

public class FOR_LOOP {
    public static void main(String[] args)
    {
        // for(int i=1; i<=10; i++)
        //{
        //    System.out.println(i);
        // }
        //here it is optional to give the initiation and updation
        //and also if want the end less loop just mention ;;


        //if we want the multiple variable
        for(int i=0,j=1;     i<=10;     i++,j=j*2)
        {
            System.out.println(i+" "+j);
            i++;
        }

    }
}
