import java.util.*;
 class js
{
    
public  static void steps(int arr[],int brr[],int t)
{   int count=0;
int j=0;
int k=0;

 
for(int i=0;i<=arr[t-1];i++)
{
    if(arr[k]==i)
    {
        System.out.print(count+" ");
        //brr[j]=count;
        
        j++;
        k++;
        count=0;
      
    }
    else
    { 
        
        count=count+1;
        j++;
     
    }

    }

}
public  static void display(int arr[],int t)
{
    for(int i=0;i<t;i++)
    { 
       System.out.print(arr[i]);
    }
}

public static void main(String[] args)
{
     Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        //int t=11;
        int arr[]=new int[t];
      //int brr[]={0,0,0,0,0,0,0,0};
        int brr[]=new int[t];
         int count=0;
        int temp=0;
    
       
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
           
        }
        steps(arr,brr,t);
       /* for(int i=1;i<t;i++)
        {
           temp=arr[0];
           if(temp+1==i||temp-1==i||temp==i)
           {

           }
        }*/
       


display(brr,t);
//System.out.print("The array is rotated "+count+" times");


}

}
