


      import java.util.*;
public class Str 
{

 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
  String str = sc.nextLine();
  str=str.toLowerCase(); 
  String str2;
  int count=0;
  char arr[]=new char[str.length()];
       
    
    char ch,c;
for (int i=0; i<str.length(); i++)
      {
        ch=str.charAt(i); 
       if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
       {
    //    c=str.charAt(i).toUpperCase();
    
    int x=((int)ch-32);
        // System.out.print(" "+(char)x);
        char js;
        js=(char)x;
     arr[i]=js;
    // str.charAt(i)=js;
     System.out.print(js);
       }
       else
       {
       arr[i]=ch;
         System.out.print(ch);
       }
      }
    // //  
    // for( char a:arr)
    // {
    //     System.out.print(a);
    // }
  
}
}
///count the character in string
///count the vowels

