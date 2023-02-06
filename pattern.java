import java.util.*;  
class UserInputDemo1  
{  
public static void main(String[] args)  
{  
 //System.in is a standard input stream  
//System.out.println("\t"+"H"+"\t"+"E"+"\t"+"E"+"\t"+"L"+"\t"+"o"); 
Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
int a=sc.nextInt(); 
for(int i=1;i<=a+1;i++)
{
    //System.out.println(i);
    System.out.print("\n");
 int k=a;

for(int j=1;j<=a+1;j++)
{
    if((i==a)&&(j==a))
 {
    k=a-1;
 }
 else{
    k=a;
 }
    System.out.print(k+" ");
}
/*for(int k=1;k<i;k++)
{
   
   System.out.print(k+" ");
}
*/
    //System.out.print(+" ");
}

}
}
 
