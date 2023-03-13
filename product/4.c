#include<stdio.h>

    


int main()
{
     int n,k;
    int arr[100];
    int brr[100];
    int m;
    int count=0;
    int temp=0;
scanf("%d",&n);
for(int i=0;i<n;i++)
{
    scanf("%d",&arr[i]);

}
scanf("%d",&m);
for(int i=0;i<m;i++)
{
    scanf("%d",&brr[i]);

}
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
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
{
    if(brr[i]<brr[j])
    {
        temp=brr[i];
        brr[i]=brr[j];
        brr[j]=temp;
    }

}
}
for(int i=0;i<n;i++)
{
    if(arr[i]==brr[i])
    {
        count++;
    }
    else
    {
        count=-1;
        break;
    }
}
if(count==n)
{
    printf("1");
}
else
{
printf("0");
}


}