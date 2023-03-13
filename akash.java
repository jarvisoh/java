import java.util.*;
class jss
{
public static void ak(int n)
{
for(int i=0;i<n;i++)
{
    System.out.print("@");
}
}
public static void ash(int n)
{
    int flag=n;
    
   
for(int i=0;i<n/2;i++)
{
int ak=n-i;
        System.out.print("\n");
    for(int j=0;j<n;j++)
{
  // System.out.print(j+" ");
 //6    System.out.print(ak);
    if((j==ak)|(j==(ak-1)))
    {
   System.out.print("##");
    }
   else {
    System.out.print(".");

    }
   ak= ak-1;
}
}
}

public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        jss js=new jss();
        js.ak(t);
        System.out.print("\n");
        js.ash(t);
           System.out.print("\n");

        js.ak(t);


}
}
