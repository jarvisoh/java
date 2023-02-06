import java.util.*;  
class UserInputDemo1  
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in);
int l=sc.nextInt();
int n=sc.nextInt();
while(n-->0)
{

 
int a=sc.nextInt();
int b=sc.nextInt();
if(a<b)
{
    System.out.print("UPLOAD ANOTHER");
}
else if(a==b){
    //accpted
    System.out.print("ACCEPTED");
}
else{
//crop it
System.out.print("CROP IT");
}

}
 

            
}  
}