import java.util.*;
class jss{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //int t=sc.nextInt();
      
          String str= sc.nextLine();
         
        //String temp="";
        char ch,ch1,x='a';
        int v=0;
        int v1=0;
        int k=0;
      //  int l=2*t;
      int flag=0;
        
      //System.out.print("Original word: ");
     // System.out.println("hello"); 
 
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        if(ch=='(')
        {  
            flag=flag+1;
      
            v=v+1;
        }
        if(ch==')')
        {
            flag=flag-1;
            v=v+1;
        }

        
        }
      if(flag==0)
      {
        System.out.print(v/2);
      }
      else{
         System.out.print("Error");
      }

}
}