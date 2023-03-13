import java.io.*;
import java.util.Scanner;
class js{
        
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
            String str= sc.nextLine();
        String temp="";
        char ch;
        int count=0;
        String[] arr = str.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            temp=arr[i];
            {
               for(int j=0;j<arr.length;j++)
            {
                 if(arr[j]==temp)
            {
                
                count++;
                if(count==2)
                {
                System.out.print(arr[j]+ " ");
                }
            }
            }
        }

}

}
}