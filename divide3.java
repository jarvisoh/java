import java.util.*;  
class UserInputDemo1  
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
int a=sc.nextInt(); 
if(a%3==0)             //reads string  
System.out.print("the number is divsible by 3 ");
else
{
 System.out.print("the number is  not divsible by 3 remainder is "+a%3);   

}             
}  
}