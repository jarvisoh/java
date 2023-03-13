#include<stdio.h>

    


int main()
{
     int n,k;
    int arr[100];
    int brr[100];
    int m;
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
scanf("%d",&k);
for(int i=0;i<m;i++)
{
    for(int j=0;j<n;j++)
    {
        if((arr[i]+brr[j])==k)
        {
            printf("%d,%d",arr[i],brr[j]);
            printf("\n");
        }
    }
}

}