import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String temp="";
      char ch1,ch,ch2;
      int flag=1;
      for (int i=0;i<str.length()-2;i++)
      {
          ch= str.charAt(i); 
           ch1= str.charAt(i+1); 
           ch2= str.charAt(i+2); 
          if(ch=='z')
          {
            if(ch1=='o')
            {
                if(ch2=='o')
                {
flag=2;
                }
            }
          }
        
      }
      
      System.out.print(flag==2 ? "Yes":" No");
      
    }
}
