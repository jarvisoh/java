import java.io.*;
import java.util.Scanner;
  
class js{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        String temp="";
        char ch;
 

        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
         System.out.println(ch);

      }


    }
}
