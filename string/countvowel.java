


      import java.util.*;
public class Str 
{

 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
  String str = sc.nextLine();
  str=str.toLowerCase(); 
  int count=0;
       
    
    char ch;
for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
       if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
       count++;
       
      }
      System.out.print(count);
}
}
///count the character in string
///count the vowels

