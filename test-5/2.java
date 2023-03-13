import java.util.*;
class jss
{
    public static void display(int arr[][],int n,int m)
    {
        int count=0;
        int max=1;
        int x=1;
       for(int i=0;i<n;i++)
        {
            count=0;
        for(int j=0;j<m;j++)
        {
            count=count+arr[i][j];
             //System.out.print(count);

            if(max<count)
            {
                max=count;
                x=i;
           
            }
        }
    }
  System.out.print(x+1);
    }
    public static void main(String[] args)

    {
        int count=0,x=0,y=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
   for(int i=0;i<n;i++)
        {
      for(int j=0;j<m;j++)
        {
            arr[i][j]=sc.nextInt();
        }
        }
        display(arr,n,m);
       
       
    }
}
