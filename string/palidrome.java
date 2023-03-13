import java.util.*;
public class Str 
{

public String rev(String s)
{
    String temp="";
    char ch;
     for (int i=0; i<s.length(); i++)
      {
        ch= s.charAt(i); 
       // System.out.println("js");
        temp= ch+temp; 
      }
      return temp;
}
 public static void main(String[] args){
  String str1 = "this madam wow good";

       Str js=new Str();
       
       str1=str1.toLowerCase(); 
       String[] arr=str1.split(" ");
       for(int i=0;i<arr.length;i++)
       {
        String temp2=js.rev(arr[i]);
      // System.out.println(arr[i]);
      //  System.out.println(temp2);

      // if(arr[i]==temp2)
      String min="";
      String max="";
      if(arr[i].equals(temp2))
       {
        
        System.out.println(arr[i]);
        int x=arr[i].length;

        if(max<=x)
        {
          max=arr[i];
        }
        else
        {
          min=arr[i];
        }
       }
       System.out.println("min"+arr[i]);
       System.out.println("max"+arr[i]);
       }



    }

}