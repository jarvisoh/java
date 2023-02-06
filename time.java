import java.util.*;  
class UserInputDemo1  
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
System.out.print("Enter a Time: ");  
int str= sc.nextInt(); 
int str2= sc.nextInt();
int str3= sc.nextInt();             //reads string  
if((0<=str)&&(str<24))
{
    if((0<=str2)&&(str2<60))
    {
      if((0<=str3)&&(str3<60))  
      {
        System.out.println("time is vaild");
      }
    }
} 
else{
    System.out.println("Error");
}           
}  
}