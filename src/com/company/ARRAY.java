package com.company;

public class ARRAY {
    public static void main(String[] args) {
         //WAY OF DECLARATION OF ARRAY
        //A[] = reference and new side is object
         int A[] = new int[10];
         int B[] = {1,2,3,4,5};
         int C[];
         C=new int [10];

         B[2]=15;
         for(int i=0; i<B.length;i++)
         {
             System.out.println(B[i]);
         }
    }
}
