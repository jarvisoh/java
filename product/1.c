#include<stdio.h>

    


int main()
{
    int n;
    int arr[100];
scanf("%d",&n);
for(int i=0;i<n;i++)
{
    scanf("%d",&arr[i]);

}

int count=0;
int temp=0;
int ct=0;
for(int i=0;i<n;i++)
{
    if((n-1)>ct)
    {
        temp++;
  count=arr[count]+count;
  ct=i+count;
    }
    else
    {
        break;
    }
    
}
printf("%d",temp);
return 0;
}