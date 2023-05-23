//4,3,7,8,,6,2,1
//3,7,4,8,2,6,1

import java.util.*;
class js{
    public static void main(String[] args)
    {
        int arr[]={4,3,7,8,6,2,1};
       int n=arr.length;
       int flag=1;
        for(int i=0;i<n-1;)
        {
            // System.out.print(arr[i]);
            if(flag==1)
            {
            if(arr[i]<arr[i+1])
            {
             int  temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            flag=2;
            }

            else if(flag==2){
             if(arr[i]>arr[i+1])
            {
             int  temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
            flag=1;
} 
            
i=i+2;

        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}