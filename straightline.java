import java.util.*;  
class UserInputDemo1  
{  
public static void main(String[] args)  
{  
 //System.in is a standard input stream  
//System.out.println("\t"+"H"+"\t"+"E"+"\t"+"E"+"\t"+"L"+"\t"+"o"); 
Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
int x1=sc.nextLong(); 
int y1=sc.nextLong(); 
int x2=sc.nextLong(); 
int y2=sc.nextLong(); 
int x3=sc.nextLong(); 
int y3=sc.nextLong(); 
try{
if(((y2-y1)/(x2-x1))==((y2-y3)/(x2-x3)))
{
System.out.print("Yes");
}
if(((y2-y1)/(x2-x1))==((y2-y3)/(x2-x3)))
}
catch{

}



}
}