#include<stdio.h>
int main()
{
     int n,k;
     scanf("%d",&n);
    int arr[100][100];
    int adj[100][100];
    int ma=0;
    int l=1;
    double js;

for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
{
    scanf("%d",&arr[i][j]);
}
}
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
{
   if(i==j)
   {
    if(i==0)
    {
         adj[i][j]=arr[i+1][j+1];
         adj[i+1][j+1]=arr[i][j];
         k=adj[i][j]*adj[i+1][j+1];

    }
}
   else
   {
    l=l*arr[i][j];
     adj[i][j]=-1*arr[i][j];
     //l=adj[i][j]*arr[i][j];
   }
}
}
//printf(" %d,%d",l,k);
ma=k-l;
for(int i=0;i<n;i++)
{
    printf("\n");
    for(int j=0;j<n;j++)
{
js=(float)adj[i][j]/ma;
  printf("%.1f ",js);
}
}
}