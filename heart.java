import java.util.*;  
class UserInputDemo1  
{  
public static void main(String[] args)  
{  
 //System.in is a standard input stream  
//System.out.println("\t"+"H"+"\t"+"E"+"\t"+"E"+"\t"+"L"+"\t"+"o"); 
Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
int a=sc.nextInt(); 
for(int i=1;i<=a+1;i++,System.out.printf("\n")){
    for(int j=1;j<=a;j++)
    {
        System.out.print(i%2==0&&j%2==0 ? "0":"1");
    }
}
}

}
