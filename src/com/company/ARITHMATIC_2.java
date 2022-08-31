package com.company;
import java.lang.*;
import java.util.Scanner;
public class ARITHMATIC_2 {
    public static void main(String[] args)
    {

     //cuboid
     // Formula of cuboid are if given condition are
     // front/back = length*height
     // right/left = breadth*height
     // bottom/top = lenght*breadth
     //volume = lenght*breadth*height

     Scanner sc = new Scanner(System.in);
     int lenght,breadth,height;
     int totalArea,volume;
        System.out.println("Enter the lenght,breadth and height ");

        lenght = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        totalArea=2*(lenght*breadth+breadth*height*lenght);
        volume=(lenght*breadth*height);

        System.out.println("The totalArea is:" +totalArea);
        System.out.println("The volume is:" +volume);
    }

}
