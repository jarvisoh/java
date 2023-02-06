import java.util.*;  
class UserInputDemo1  
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
int a=sc.nextInt(); 
int b=sc.nextInt(); 
int k,count=1;
int count1=1;
int count3=1;
int count2=1;

k=a<b?b:a;
while(true){
    if(k%a==0&&k%b==0)
    {
        System.out.println(k);
        break;
    }
    k++;
}
}
}