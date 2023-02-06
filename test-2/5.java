import java.io.*;
import java.util.Scanner;
  
class jss {
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       
    
      char ch1,ch;
      int count=0,count2=0;
      while(t-- >0)
      {
        sc.nextLine();
       String str=sc.nextLine();
    

       String str1=sc.nextLine();
           
      for (int i=0;i<str.length();i++)
      {
          ch= str.charAt(i); 
          ch1=str1.charAt(i);
          if(ch!=ch1)
          {
            count++;
          }
            //System.out.print(count);
          //ount2=str.length()-count;
         

    }
     System.out.print(count);
      }
}
}