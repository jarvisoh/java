import java.io.*;
import java.util.Scanner;
  
class jss {
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        //int t=11;
        int q=t-6;
        for(int i=0;i<t;i++)
        {
            

     // System.out.print(flag==2 ? "Yes":" No");
     if((4<=i)&&(i<=7))
     {
        System.out.print("#");
     }
     else
     {
        System.out.print(" ");
     }
        }
        System.out.print("\n");
    for(int i=0;i<t;i++)
        {
             if(((2<=i)&&(i<=3))||((8<=i)&&(i<=9)))
     {
        System.out.print("*");
     }
     else
     {
        System.out.print(" ");
     }
        }
 System.out.print("\n");
for(int i=0;i<t;i++)
        {
             if(((1<=i)&&(i<=2))||((9<=i)&&(i<=10)))
     {
        System.out.print("*");
     }
     else
     {
        System.out.print(" ");
     }
        }

        for(int i=0;i<q;i++)
        {
            

        System.out.print("\n##");
     }
     System.out.print("\n");
for(int i=0;i<t;i++)
        {
             if(((1<=i)&&(i<=2))||((9<=i)&&(i<=10)))
     {
        System.out.print("*");
     }
     else
     {
        System.out.print(" ");
     }
        }
          System.out.print("\n");

           for(int i=0;i<t;i++)
        {
             if(((2<=i)&&(i<=3))||((8<=i)&&(i<=9)))
     {
        System.out.print("*");
     }
     else
     {
        System.out.print(" ");
     }
        }
          System.out.print("\n");
           for(int i=0;i<t;i++)
        {
            

     // System.out.print(flag==2 ? "Yes":" No");
     if((4<=i)&&(i<=7))
     {
        System.out.print("#");
     }
     else
     {
        System.out.print(" ");
     }
        }
    }
}
