import java.util.*;
public class Str 
{

 public static void main(String[] args){

   Scanner sc=new Scanner(System.in);
  int n = sc.nextInt();
int m=0;
int mode=0;
  for(int i=0;i<n;)
  {
      for(int j=0;j<=i;j++)
      {
        if((m>=0)&&(mode==0))
        {
    System.out.print(m+" "); 
   m=m-1;
        }
       //System.out.print(m+"->"); 
       else{
         mode=1;
       }
        if(mode==1)
        {
              if(m<0)
              {
                // m=m*-1;
              System.out.print((m*-1)+" "); 
           
              }
              else
              {
                 System.out.print(m+" "); 
              }
             m=m+1;
      
        }
   if(i==4)
        {
            // System.out.print("->"+mode+" "); 
        }

      }
 m=m+1;
 mode=0;
      System.out.print("\n");
   
i=i+2;
  }

 }
}