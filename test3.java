/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main {

	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    while(a-- >0)
	   {
	     int t=sc.nextInt();
	     int arr[]=new int[t];
	     for(int i=0;i<t;i++)
	     {
	         arr[i]=sc.nextInt();
	     }
	    System.out.print(arr[3]);
	   }
		// your code goes here
	}
	
}
