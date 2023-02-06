import java.util.*;  
class UserInputDemo1  
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
int a=sc.nextInt();
 
for(int i=1;i<=a;i++,System.out.println())
{
    if(i%2==0)
    System.out.print(i+1);
    for(int j=1;j<=a;j++)
    {
       // System.out.print("\n");
        System.out.print(i);
   
     }
   if(i%2!=0)
   {
       System.out.print(i+1); 
   }
   
}
            
}  
}