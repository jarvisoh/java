import java.util.*;
  
class jss {

int x;
String y;
 jss(jss js5)
  {
int q=js5.x;
String kl=js5.y;
System.out.println(q+" "+kl);
     
  }
   jss(int a,String str)
  {
x=a;
y=str;
     
  }
  public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);


jss js5=new jss(7,"js");
jss js4=new jss(js5);







}
}