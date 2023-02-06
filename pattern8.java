import java.io.*;
import java.util.Scanner;
  
class jss {
    public void js(String stq,int n){
jss cs=new jss();
cs.str(n);
cs.star(n);
//System.out.print(stq);
char ch;
 for (int i=0; i<stq.length(); i++)
      {
        ch= stq.charAt(i); //extracts each character
        System.out.print(ch+" "); //adds each character in front of the existing string
      }
cs.star(n);
System.out.print("\n");
cs.space(n);
cs.starr(n);
/*sp.space(n);
sr.starr(n);
sp.space(n);
System.out.print("\n");
cs.star(n);
System.out.print(stq);
cs.star(n);
System.out.print("\n");
sp.space(n);
sr.starr(n);
sp.space(n);*/
    }
    public void star(int n)
    {
        for(int i=0;i<n-1;i++)
        {
            System.out.print("*"+" ");
        }
    }
     public void space(int n)
    {
        for(int i=0;i<n+3;i++)
        {
            System.out.print(" ");
        }
    }
     public void starr(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print("*"+" ");
        }
    }
    
     public void str(int n)
    {
jss st=new jss();
int flag=0;
int ak=((n*2)+2);

        for(int i=0;i<n;i++)
        {
          
               st.spaces(ak);
           
            for(int j=i;j>=0;j--)
        {
            //st.spaces(ak);
            System.out.print("*"+ " ");
            //st.spaces(ak);
        }
       st.spaces(ak);
         System.out.print("\n");
        ak--;
       // st.spaces(ak);
    }
    }
       public void spaces(int n)
    {
        //int ak=((n*2)-2);
        for(int i=0;i<n;i++)
        {
            System.out.print(" ");
            
        }
       
    }
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
       
    
      char ch1,ch;
      int count=0,count2=0;
     
       
       
       jss ks=new jss();
    String str=sc.nextLine();
     

       //String str1=sc.nextLine();

      ks.js(str,str.length());
    
       
           
     
            //System.out.print(count);
          //ount2=str.length()-count;
         

    
     
      }
}
