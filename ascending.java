class js{
  public static void main(String[] args)
  {
    int n=8;
    int m=6;
    int jack=1000;
    int arr[]={32,4,65,78,3,21,68,1};
   // arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
      if(arr[j]>arr[i])
     {
     jack=arr[j];
     arr[j]=arr[i];
     arr[i]=jack;
     }
    }
    }
System.out.print(arr[m-1]);
    
  }
}