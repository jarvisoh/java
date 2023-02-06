import java.util.*;
class jss{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
      //String str=sc.nextLine();
       // char str= sc.nextchar();
        String temp="";
       char ch,ch1,x='a';
       // int v=0;
        //int v1=0;
        //int k=0;
        //int l=2*t;
        
      //System.out.print(str);
     // System.out.println("hello"); 
  
          //String str= sc.nextLine();
    for (int i=0; i<t; i++)
      {
        ch1= sc.next().charAt(i); 
     
       
        if(ch1=='.')
        {
        temp='B'+temp; 
     
        }
        else{
        temp= ch1+temp; 
        }
      }
      System.out.println("YES");
      System.out.print(temp);
}
}