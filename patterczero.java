import java.util.*;  
class UserInputDemo1  
{  
public static void main(String[] args)  
{  
 //System.in is a standard input stream  
//System.out.println("\t"+"H"+"\t"+"E"+"\t"+"E"+"\t"+"L"+"\t"+"o"); 
Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
int a=sc.nextInt();
int b; 
for(int i=0;i<a;i++,System.out.printf("\n")){
    for(int j=0;j<a;j++)
    {
        b=a/2;
        //System.out.print(i==1||j==1||i==a||j==a ? " 1":" 0"+b);
   System.out.print(i==b&&j==b? " 0":" 1");
    }
}
}

}
