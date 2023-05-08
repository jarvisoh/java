

      import java.util.*;
public class Str 
{

 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
  String str = "this is how is work the of for to you";
int is=0,of=0,the=0;
String js[]=str.split(" ");
for(String a:js)
{
if(a.equals("is"))
{
    is++;
}
if(a.equals("of"))
{
    of++;
}
if(a.equals("the"))
{
    the++;
}

}
System.out.println("is->"+is);
System.out.println("of->"+of);

System.out.println("the->"+the);


 }
}