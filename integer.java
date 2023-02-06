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
if(i%2==0)
{
    for(int k=a;k>=1;k--)
    {
        if(k%2!=0){
    System.out.print(k+" ");}
    }

}
else
{
for(int j=1;j<=a;j++)
{
    if(j%2!=0)
    {
    System.out.print(j+" ");}
}
}
}
}  
}