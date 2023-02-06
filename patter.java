import java.util.*;  
class UserInputDemo1  
{  
public static void main(String[] args)  
{  
 //System.in is a standard input stream  
//System.out.println("\t"+"H"+"\t"+"E"+"\t"+"E"+"\t"+"L"+"\t"+"o"); 
Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
int a=sc.nextInt(); 
for(int i=1;i<=a;i++)
{
    //System.out.println(i);
    System.out.print("\n");

for(int j=i;j<=a;j++)
{
   
    System.out.print(j+" ");
}
for(int k=1;k<i;k++)
{
   
   System.out.print(k+" ");
}
    //System.out.print(+" ");
}

}
}
 



?
import java.util.*;\n
class js{
    \n  
    public static void main(String args[])\n 
     {\n 
      Scanner sc=new Scanner(System.in);
      \n  long s=sc.nextLong();\n   
      long b,c;
      \n  \n \n  b=s*60*60*24;
      \n  c=186000*b;
      \n  System.out.print(c);\n  }\n}