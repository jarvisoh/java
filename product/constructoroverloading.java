import java.util.*;
  
class jss {
int count=1;
float count1;
int x;
String y;
jss()
  {
    int x=1;
    int y=1;
    System.out.println(x+y);
  }
  jss(int x,int y)
  {
    count=x*y;
  
    
  }
   jss(int x,int y,int z)
  {
    
     count=x*y*z;
    
  }
    jss(int x)
  {

     count=x*x;
  }
   jss(float x)
  {

     count1=((22/7)*(x*x));
  }//copy construr
   jss(jss js5)
  {
int q=js5.x;
String kl=js5.y;
System.out.println(q+kl);
     
  }
   jss(int a,String str)
  {
x=a;
y=str;
     
  }
  public void display()
  {
System.out.println(count);
//System.out.println(y);
  }

   public void display1()
  {
System.out.println(x);
System.out.println(y);
  }

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
jss js=new jss(4);
//jss js3=new jss(4.0);
jss js1=new jss(4,7);
jss js2=new jss(7,8,9);


js.display();
js1.display();
js2.display();
//js3.display1();








}
}