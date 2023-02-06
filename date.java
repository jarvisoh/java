import java.util.*;  
class UserInputDemo1  
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
int d=sc.nextInt(); 
int m=sc.nextInt();
int y=sc.nextInt();
if((y>1990)&&(y<20000))
{
    if((0<m)&&(m<13))
    {
        if((d<30)&&(d>=1)&&((m==4)||(m==6)||(m==9)||(m==11)))
        {
            System.out.print("month isvaild");
        }
        else if((d<32)&&((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12)))
        {
        System.out.print("month isvaild");
        }
        else if(((d==28)||(d==29))&&(m==2))
        {
           System.out.print("month isvaild"); 
        }
        else{
            System.out.print("month is not vaild");
        }
    }
}            
}  
}