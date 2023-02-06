import java.util.*;
class jss{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       
        int t=sc.nextInt();
        int arr[]=new int[t];
                
        int temp=0;
            for(int i=0;i<t;i++)
            {
               arr[i]=sc.nextInt(); 
             }
            
          
           
            for(int i=0;i<t-1;i++)
            {
                for(int j=0;j<t-i-1;j++)
            {
            if(arr[j]>arr[j+1])
            {
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
           // System.out.print(arr[i]);
            }
            }
            }
             for(int i=0;i<t;i++)
            {
             System.out.print(arr[i]+" ");
            }
           // System.out.print(count);
// to print a new way for print element
//for(ele:arr)
//{
 //  System.out.print(ele+" "); 
//}


        
    }
}