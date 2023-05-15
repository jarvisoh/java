
public class GenericsTester 
{
   public static void main(String[] args) 
   {
      String js="jothis";//othisj
      char[] str=js.toCharArray();
      char temp;

      temp=str[0];
      str[0]=str[str.length-1];
      str[str.length-1]=temp;

      for(char b:str)
      {
         System.out.print(b);
      }


   }

}
