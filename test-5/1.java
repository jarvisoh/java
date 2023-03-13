import java.util.*;
class jss
{
    public static int compare(int x,int y)
    {
       int value;
        if(x==y)
        {
            value=0;
        }
        else
        {
            value=1;
        }
        return value;
    }
    public static void main(String[] args)

    {
        int count=0,x=0,y=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            x=i;
            y=i+1;
            if(y>=n)
            {
                y=y-n;
            }
           count=count+compare(arr[x],arr[y]);
            
            
        }
       System.out.print(count);
    }
}
