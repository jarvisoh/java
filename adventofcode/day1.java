
import java.util.*;
class jss{
    public void print(int arr[][])
    {
          for (int i=0;i<arr.length;i++)
        {
            System.out.print("\n");
            for(int j=0;j<arr[i].length;j++)
            {
                
            System.out.print(arr[i][j]+" ");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        jss js=new jss();
        int max=0,sum=0;
        int a=sc.nextInt();
       int arr[][]=new int[a][];
        
          for (int i=0;i<a;i++)
        {
            sum=0;
            System.out.print("row count");
            int b=sc.nextInt();
            arr[i]=new int[b];
            for(int j=0;j<b;j++)
            {
                
        arr[i][j]=sc.nextInt();
        sum+=arr[i][j];
            }
            if(sum>max)
            {
                max=sum;
            }
           
        }
         js.print(arr);
         System.out.print(max);
       
    }
}
/*


import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      
      //Taking the input from user
      int r = scn.nextInt();
 
        // Declaring jagged array with r rows
        int arr[][] = new int[r][];
 
        //We are creating a jagged array where the 0th row has 1 element, 
        //1st row has 2 elements
        //such that nth row has n+1 elements
        for (int i = 0; i < arr.length; i++)
            arr[i] = new int[i + 1];
 
        // Initializing array
        int temp = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = temp++;
 
        // Displaying the elements of 2-D Jagged array
        System.out.println("Elements of 2-D Jagged Array for n= " + r);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
  }
}*/