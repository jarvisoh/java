import java.util.*;

class TestClass{
    public static void main(String args[] )
    {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-- >=0)
      { 

          int n=sc.nextInt();
          int arr[]=new int[n];
          int sum=0;
          for(int i=0;i<n;i++)
          {
            arr[i]=sc.nextInt();
          }
          int k=arr[1]&arr[2];
          int q=arr[1]|arr[2];
            sum=k^q;
            System.out.print(sum);
          

      }

    }
}
