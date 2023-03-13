import java.util.*;
public class Str 
{

 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

  String str1 = sc.nextLine();
  String str = sc.nextLine();
 // System.out.print(str1);
  int count=0;

   String[] str3 = str1.split(" ");

for (String a : str3)
   {

  if(a==str){
     count++;
       System.out.print(count);
  }
    System.out.print(count);

 }
}}