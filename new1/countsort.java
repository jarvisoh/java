class js{
public static void main(String args[])   
{  
int arr[]={1,20,6,4,5};
int n=arr.length;
int count=0;
for(int i=0;i<n-1;i++)
{
    if(arr[i]>arr[i+1])
    {
        int temp=arr[i+1];
        arr[i+1]=arr[i];
        arr[i]=temp;
        count++;
    }
}
for(int i=0;i<n;i++)
{
System.out.print(" "+arr[i]);

}

System.out.print("count=>"+count);

}
}