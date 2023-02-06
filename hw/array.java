import java.util.*;
class jss{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int c=0,d=0;
        int count=0;
              int n=sc.nextInt();
       int arr[]=new int[n];
 
       
       for(int i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++)
       {
         for(int j=0;j<n;j++)
       {
        if(arr[i]==arr[j])
        {
            System.out.print(count+" ");
            count++;
        }
       }
       }
System.out.print(count);


    }
}
