import java.util.*;
public class Str 
{
public static void star(int i)
{

 for(int j=0;j<i;j++)
{
System.out.print("*");
}
}



public static void space(int i,int n)
{


    for(int j=i;j<=n;j++)
{
System.out.print(" ");
}

}
public static void start1(int i)
{

    for(int j=0;j<i;j++)
{
System.out.print("*");
}
}

 public static void main(String[] args)
 {
  int n=5;
//   **********
//   **** ****
//   ***  ***
//   **   **
//   *    *
for(int i=n;i>0;i--)
{
star(i);

space(i,n);

start1(i);
System.out.print("\n");

 }
 for(int i=1;i<=n;i++)
{
star(i);

space(i,n);

start1(i);
System.out.print("\n");

 }
 }
 }
