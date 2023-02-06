import java.util.*;
class jss{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       int count=0,p=0,q=0;
        int t=sc.nextInt();
        int h=sc.nextInt();
        int arr[]=new int[t];
        int brr[]=new int[h];
        for(int i=0;i<t;i++)
            {
               arr[i]=sc.nextInt(); 
             }

        for(int j=0;j<h;j++)
            {
               brr[j]=sc.nextInt(); 
             }
    for(int i=0;i<t;i++)
    {   
        for(int j=0;j<h;j++)
        {
        if(arr[i]==brr[j])
        {
        count++;
        }
      //  
        }
    }
    
    System.out.print((t-count)+(h-count)+(count));




    }

}