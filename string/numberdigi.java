import java.util.*;
class js{

    public static void main(String[] args)
    {
int n=56701557;
int dig,max=0;

while(n>0)
{
dig=n%1000;
if((max<dig))
{
    max=dig;
//
}
  n=n/10;
}
System.out.print(max);
  
}

       

}
