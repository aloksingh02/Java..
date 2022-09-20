package com.company;
import java.util.*;

public class _1D_ARRAY {
    public static void main(String[] args) {
        //1.finding the sum of all elements
        Scanner sc=new Scanner(System.in);

        int A[] = {2, 6, 5, 56, 5, 6, 4, 9, 8, 4, 5, 6, 5, 5, 6, 4, 68, 9, 8,};

        //int sum = 0;

        //for (int i = 0; i < A.length; i++)
        //{
          //  sum = sum + A[i];
        //}
        //System.out.println("sum is:"+sum);


        //2.Searching the element


        int key;
        System.out.println("Enter the key");
        key=sc.nextInt();



        for(int i=0; i<A.length; i++)
        {
            if(key==A[i])

            {
                System.out.println("Element found at :"+1);
                System.exit(0);

            }
            System.out.println("Not found");

        }
    }
}
