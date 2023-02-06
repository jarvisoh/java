import java.util.*;  
class UserInputDemo1  
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
int a=sc.nextInt(); 
if((a%4==0)&&((a%400==0)||(a%100!=0)))
{
    System.out.println("Leap year");
}       
else{
    System.out.println("Not Leap year");
}      //reads string  
             
}  
}