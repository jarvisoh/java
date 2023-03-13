import java.util.*;
  
class jss {
    int rollno;
    String str;
     void insert(int j,String s)
    {
    
    rollno=j;
    str=s;
    }
    void display()
    {
   System.out.println(rollno+" "+str);
    }
 

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
jss js=new jss();
jss js1=new jss();
js.insert(4,"jothis");
js1.insert(5,"joth");
js.display();
js1.display();





}
}