#include<stdio.h>
int main()
{
     int n,k;
    int arr[100];
scanf("%d",&n);
for(int i=0;i<n;i++)
{
    scanf("%d",&arr[i]);

}

scanf("%d",&k);
int temp=0;
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
{
    if(arr[i]<arr[j])
    {
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
}

    printf("%d",arr[k-1]);



}
