import java.util.*;
class jss {

public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int p=0;
    int c=1;
    int d=0;
    System.out.print(p+" ");
    System.out.print(c +" ");
  while(n-->2)
  {
            d=c*2+p;
           p=c;
           c=d;
            System.out.print(d +" "); 
        }





}
}