import java.util.*;
class js{

    public static int remove(int arr[])
    {
         int sum=0,sumx=0;
        for(int i=0;i<arr.length;i++)
        {
            // System.out.print(arr[i]);
              for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]==arr[j])
            {
                arr[i]=0;
                arr[j]=0;
            }
        }
         
            {
                if(arr[i]>0)
            {
                sum=sum+arr[i];
              
            }
            else
            {
                sumx+=arr[i];
            }
            }
        
        }
       

       
        return (sum-sumx);
       
    }

    public static void main(String[] args)
    {
        int arr[]={1,5,-2,-1,3,4,5};
      int js=remove(arr);
      System.out.print(js);
       

        
    }
}