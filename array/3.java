import java.util.*;
  
class jss {
  /*  public void create(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }*/

    public void check(int x)
    {
         if(x<9)
            {
                System.out.print(("S"));
            }
            else{
                System.out.print(("D"));
            }
    }
     public void cal(int arr[],int n,int m)
    {
      int x;
      for(int i=0;i<2;i++)
      {
             System.out.println();
             x=arr[i]*arr[m+1];
            System.out.print((x)+ "->");
            check(x);
            m--;
      }
        
    }
     public void call(int arr[],int n,int m)
    {
     int x;
      for(int i=n;i<n+2;i++)
      { 
        System.out.println();
        x=arr[i]*arr[m+1];

            System.out.print(x+"->");
            check(x);
           
            m--;
      }
        
    }
      public void centre(int arr[],int n,int m)
    {
       int x;
       System.out.println();
       x=arr[n]*arr[m];
         System.out.print((x)+ "->");
         check(x);
           
        
    }

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
jss js=new jss();
//int n=sc.nextInt();
int arr[]={1,2,3,4,5,6,7,8,9,10};
int n=arr.length/2;
//System.out.print(n);
js.cal(arr,n-3,n);
js.centre(arr,n-3,n+2);
js.call(arr,n-2,n+3);
System.out.println();
System.out.println();



}


}