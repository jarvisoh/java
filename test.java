import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String temp="";
      char ch1,ch,ch2;
      int count=0,count2=0;
      for (int i=0;i<str.length();i++)
      {
          ch= str.charAt(i); 
            
          if(ch=='z')
          {

            
              count+=2;
          }
            if(ch=='o')
            {
             

            
              count2+=1;
            }
      }

    count=7;
      System.out.print(count/2);
      
    
}

}


 /*String[] string = new String [sc.nextInt()];      

sc.nextLine();   
for (int i = 0; i < string.length; i++)   
{  
string[i] = sc.nextLine();  

