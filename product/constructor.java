import java.util.*;
  
class jss {
  int x;
  String y="";
 /* jss()
  {
    int x=1;
    int y=1;
    System.out.println(x+y);
  }*/
  jss(int i,String s)
  {
    
     x=i;
    y=s;
    
  }
  public void display()
  {
System.out.println(x);
System.out.println(y);
  }

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
jss js=new jss(1,"js");
js.display();






}
}