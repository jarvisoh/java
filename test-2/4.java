import java.io.*;
import java.util.Scanner;
  
class jss {
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int flag=0;
    
      char ch1,ch;
      int count=0,count2=1;
      if(t==2)
      {
        for(int i=t;i<=n;i++)
      {
        count2=count2*i;
        flag=1;
      }
      }
    else{
       for(int i=t;i<=n;i++)
      {
        count=count+i;
         flag=2;
      } 
    }
      
      if(flag==1)
      {
   
      System.out.print(count2);
      }
      else{
  System.out.print(count);
      }


    }
}