class js
{
public static void main(String[] args)
{

    int n=3;
    int count=0;
    double arr[]={9.0,10.0,10.10,12.00,11.00,1.00};
//     while(n-->0)
//     {
//         for(int i=0;i<n*2;i++)
//         {
//             int arr[i]=sc.nextInt();
//         }
//     }
//       for(int i=0;i<n*2;)
//       {


//         i=i+2;
//       }
// }
        for(int i=1;i<n*2-1;i++)
        {
            if((arr[i]<arr[i+1])&&((arr[i-1]<arr[i])))
            {
               // System.out.print("js");
                count++;
            }
        }
System.out.print(count);

}
}