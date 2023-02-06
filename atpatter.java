import java.util.*;  
class sk
{  
public static void main(String[] args)  
{ 
 Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
   // int n=7;
   int m=n;
   
for(int i=0;i<9;i++)
{
    System.out.print("@");
}
for(int i=0;i<n-1;i++)
{
   System.out.print("\n");
    for(int j=0;j<n;j++)
    { System.out.print(" ");
        if(j==(m-1))
        {
        m=m-1;
            System.out.print("##");
        }
   
    }

     
    
}
System.out.print("\n");
for(int i=0;i<9;i++)

{`
    System.out.print("@");
}
}
}