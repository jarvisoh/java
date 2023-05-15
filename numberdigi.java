import java.util.*;
class js{

    public static void main(String[] args)
    {
//int n=3011213;
int n=
int r,max=0;

while(n>10)
{
r=n%1000;


if((r>max)&&(r%2!=0))
{
    max=r;

}
  n=n/10;
}
System.out.print(max);
  
}

       

}

