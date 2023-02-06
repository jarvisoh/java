import java.util.*;
class jss{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
              int n=sc.nextInt();
       int arr[]=new int[n];
 
       System.out.print("enter the array");
       for(int i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
       }
       System.out.print("enter the array to find :");
        int m=sc.nextInt();

       for(int j=0;j<n;j++)
       {
          
//System.out.print(sum+" ");

if(arr[j]==m)
{
   sum=1;
   
   //System.out.print("Found");
}
       }
if(sum==1)
{
  System.out.print("Found");
}     
else
{
 System.out.print("Not found ");
}
       
}
}
