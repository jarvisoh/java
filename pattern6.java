import java.io.*;
import java.util.Scanner;
  
class jss {
    public void js(String stq,int n){
jss cs=new jss();

cs.star(n);
System.out.print(stq);
cs.star(n);
    }
    public void star(int n)
    {
        for(int i=0;i<n-1;i++)
        {
            System.out.print("*");
        }
    }
    
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
       
    
      char ch1,ch;
      int count=0,count2=0;
     
       
       
       jss ks=new jss();
    String str=sc.nextLine();
     String str1=sc.nextLine();
      String str2=sc.nextLine();

       //String str1=sc.nextLine();

      ks.js(str,str.length());
      System.out.print("\n");
      ks.js(str1,str1.length());
    System.out.print("\n");
      ks.js(str2,str2.length());
       
           
     
            //System.out.print(count);
          //ount2=str.length()-count;
         

    
     
      }
}
