import java.util.*;
 class js
{
    
public  static void rot(int arr[],int t)
{
    for(int i=0;i<t;i++)
   { 
        int temp=0;
    temp=arr[i];
        arr[i]=arr[t-1];
        arr[t-1]=temp;
        
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
     //   int brr[]=new int[t];
     //    int krr[]=new int[t];
         int count=0;
        int temp=0;
    
       
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
           
        }
        for(int i=0;i<t-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
               
               temp++;
            }
            else{
                 rot(arr,t);
                 count++;
            }
        }
       


//display(arr,t);
System.out.print("The array is rotated "+count+" times");


}

}
