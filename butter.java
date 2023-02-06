import java.util.*;  
class UserInputDemo1  
{  
public static void main(String[] args)  
{  
 //System.in is a standard input stream  
//System.out.println("\t"+"H"+"\t"+"E"+"\t"+"E"+"\t"+"L"+"\t"+"o"); 
Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
int a=sc.nextInt(); 
for(int i=1;i<a;i++)
{
    //System.out.println(i);
    System.out.print("\n");

for(int j=1;j<=i;j++)
{
   
    System.out.print("*");
}
for (int j=a;j>i;j--)
{
   System.out.print(" "); 
}
for (int j=a;j>i;j--)
{
   System.out.print(" "); 
}
for(int j=1;j<=i;j++)
{
   
    System.out.print("*");
}
}
for(int i=1;i<=a;i++)
{
    //System.out.println(i);
    System.out.print("\n");


for(int j=a;j>=i;j--)
{
   
  System.out.print("*");
}
for (int j=1;j<i;j++)
{
   System.out.print(" "); 
}
for (int j=1;j<i;j++)
{
   System.out.print(" "); 
}

for(int j=a;j>=i;j--)
{
   
    System.out.print("*");
}//
//for(int k=1;k<i;k++)
{
   
  // System.out.print(k+" ");
}
    //System.out.print(+" ");
}

}
}
 


