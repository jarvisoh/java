import java.util.*;
public class Str 
{
public static char nonreap(String str)
{
    Map<Character,Integer> count= new HashMap<>();
for(char a:str.toCharArray())
{
   
    count.put(a,count.getOrDefault(a,0)+1);
}
for(char a:str.toCharArray())
{
if(count.get(a)==1)
{
    return a;
}
}
return '#';
}



 public static void main(String[] args)
 {
  String str1 = "Helloo";
  char c=nonreap(str1);
    System.out.print(c);





 }

}
