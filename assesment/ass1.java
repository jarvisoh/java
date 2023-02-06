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
             for(int i=0;i<t;i++)
             {
             if(arr[i]<0)
             {
        
           
            System.out.print(arr[i]+" ");
             }
             }
           for(int j=0;j<t;j++)
             {
             if(arr[j]>0)
             {
        
           
            System.out.print(arr[j]+" ");
             }
             }
    }
}
