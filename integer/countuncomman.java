class js{

    public static void main(String[] args)
    {
  int[] arr={1,2,3,4,5};
  int[] brr={2,3,4,5,6};
  int count=0;

for(int i=0;i<arr.length;i++)
{
    int c=1;
    for(int j=0;j<brr.length;j++)

    {
        if(arr[i]==brr[j])
        {
              c=0;
            break;
          
        }
      
    }
    if(c==1)
    {
        count++;
    }
}
for(int i=0;i<arr.length;i++)
{
    int c=1;
    for(int j=0;j<brr.length;j++)

    {
        if(brr[i]==arr[j])
        {
              c=0;
            break;
          
        }
      
    }
    if(c==1)
    {
        count++;
    }
}
System.out.print(count);
    }


    }