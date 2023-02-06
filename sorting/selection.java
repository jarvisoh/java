import java.util.*;
class jss{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       
        int t=sc.nextInt();
        int arr[]=new int[t];
                
        int min;
            for(int i=0;i<t;i++)
            {
               arr[i]=sc.nextInt(); 
             }
            for(int i=0;i<t-1;i++)
            {
                min=i;
            for(int j=i+1;j<t;j++)
            {
            if(arr[j]<arr[min])
            {
           min=j;
            }
              }
            int temp =arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
             }
             for(int i=0;i<t;i++)
            {
             System.out.print(arr[i]+" ");
            }
        


        
    }
}