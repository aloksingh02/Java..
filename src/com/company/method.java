package com.company;
import java.util.*;

public class method {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
//reading value from the user
        int num=scan.nextInt();
//method calling
        findEvenOdd(num);
    }
}

