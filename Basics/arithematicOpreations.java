package Basics;

import java.util.*;

public class arithematicOpreations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
        System.out.println();
        //Addition
        System.out.println(a+b);

        //Subtraction
        System.out.println(a-b);

        //Multiply
        System.out.println(a*b);

        //Division
        System.out.println(a/b);

        //Modulus
        System.out.println(a%b);

        sc.close();
    }
}
