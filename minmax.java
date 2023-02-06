import java.util.*;
class js{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        int min=100;
     for(int i=0;i<a;i++)
     {
arr[i]=sc.nextInt();
     }   
       for(int i=0;i<a;i++)   
       {
        if(min>arr[i])
        {
        min=arr[i];
        }
       }
       System.out.print(min);
    }
}