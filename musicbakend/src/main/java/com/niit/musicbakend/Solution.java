package com.niit.musicbakend;

import java.util.*;
import java.io.*;
public class Solution {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

           try
            {
        	   System.out.println("Enter long");
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=(-2^7) && x<=((2^7)-1))
                    System.out.println("* byte");
                if(x>=(-2^15) && x<=((2^15)-1))
                    System.out.println("* short");
                if(x>=(-2^31) && x<=((2^31)-1))
                    System.out.println("* int");
                if(x>=(-2^63) && x<=((2^63)-1))
                    System.out.println("* long");
                
           }
          catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }

	}

}
