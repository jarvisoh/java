import java.util.*;
import java.lang.Math;
class jss{
public static void prnt(int[] arr)
{
    for(int a:arr)
{
    System.out.print(" "+a);
}
}
public static void swap(int[] arr)
{
    int count=0;
for(int i=0;i<arr.length-1;i++)
{
for(int j=0;j<arr.length-i-1;j++)
{
    int temp;
    if(arr[j]>arr[j+1])
    {
        temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
    }
    count++;
}

}
System.out.print(count);

}
public static void swapp(int[] arr)
{
    int m=0;
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr.length;j++)
{
    int temp;
    if(arr[i]>arr[j])
    {
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    m++;
}

}
System.out.print(m);
}

    public static void main(String[] args)
    {
Scanner sc=new Scanner(System.in);

int arr[]={2,3,4,5,1,7,12,6,0,21};
swapp(arr);
System.out.print("\n");
swap(arr);

prnt(arr);

    }


}