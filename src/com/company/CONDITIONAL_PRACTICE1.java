package com.company;
import java.util.*;

public class CONDITIONAL_PRACTICE1 {
    public static void main(String[] args) {
        //find the type of website and the protocol used

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the url");
        String url = sc.nextLine();

        String protocol=url.substring(0, url.indexOf(":"));
         if(protocol.equals("http"))
             System.out.println("Hypertext transfer protocol");
         else if(protocol.equals("ftp"))
             System.out.println("file Transfer Protocol");

         String ext = url.substring(url.lastIndexOf(".")+1);

         if(ext.equals("com"))
             System.out.println("commercial");
         else if(ext.equals("org"))
             System.out.println("organisation");
         else if(ext.equals("net"))
             System.out.println("network");


    }
}
