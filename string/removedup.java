import java.io.*;
import java.util.Scanner;
class js{
        
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
            String str= sc.nextLine();


            char ch,eh;
            for(int i=0;i<str.length();i++)
            {
                for(int j=i+1;j<str.length()-1;j++)
                {
                    ch=str.charAt(i);
                    eh=str.charAt(j+1);      
                    if(ch==eh)
                    {
                        System.out.print(ch);
                       str=str.replace("a","");
                    }
                          
                              }
            }
            System.out.print(str);


    }
}
