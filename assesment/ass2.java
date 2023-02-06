import java.util.*;
class jss{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       
        int t=sc.nextInt();
       
        int arr[]=new int[t];
                
       

            for(int i=0;i<t;i++)
            {
               arr[i]=sc.nextInt();
            }
 int r=sc.nextInt();
            
             for(int j=0;j<t;j++)
            {
        for(int i=0;i<t;i++)
            {
               int temp=0;
               if(i=0)
               { 
                
                arr[t-1]=arr[i];
               }
               if(i<t)
               {
            
              temp=arr[i];
              arr[i]=arr[i+1];
              arr[i+1]=temp;
               }
            }
            }
             for(int i=0;i<t;i++)
            {
              System.out.print(arr[i]);
            }


    }
}