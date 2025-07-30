package Basics;

import java.util.*;

public class inputString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string:");
        String str=sc.nextLine();
        System.out.println(str);
        sc.close();
    }
}
