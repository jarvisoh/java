import java.util.*;
class jss
{
    public static void js(int brr[][],int a,int i,int n)
    {
        int temp=0;
        
       
        for(int j=n-1;j>=0;j--)
        {
            temp=a%10;
            brr[i][j]=temp;
            a=a/10;
        }
        
       
    }
    public static int count(int brr[][],int n)
    {
        int count=0;
         for(int i=0;i<n;i++)
        {
            System.out.print("\n");
            for(int j=0;j<n;j++)
            {
                if((i==0||j==0||i==4||j==4)||(j==1&&brr[i][j]>=5))
                {
               count++;
                }
                if(j==3)
                {
                    if(brr[i][j]>=5)
                    {
                        count++;
                    }
                }
                if(j==4)
                {
                    if(brr[i][j]>=5)
                    {
                        count++;Perfect
                    }
                }
            }
        }
        return count;
    }

    public static void display(int brr[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print("\n");
            for(int j=0;j<n;j++)
            {
                System.out.print(brr[i][j]+" ");
            }
        }

    }
    public static void main(String[] args)

    {
        int count=0,x=0,y=0;
        Scanner sc=new Scanner(System.in);
        int brr[][]=new int[5][5];
        //int n=sc.nextInt();
        int n=5;
        //int arr[]=new int[n];
        int arr[]={30373,25512,65332,33549,35390};
 
    /*  for(int j=0;j<n;j++)
        {
            arr[j]=sc.nextInt();
        }*/
        for(int i=n-1;i>=0;i--)
        {
            x=arr[i];
        js(brr,x,i,n);
        }
        System.out.print(count(brr,n));
       // display(brr,n);

        }
       // display(arr,n,m);
       
       
    }

