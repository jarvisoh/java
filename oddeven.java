import java.util.*;
class jss{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
              int n=sc.nextInt();


           for(int i=2;i<n;i++)
           {
           // System.out.print(i);
            if(n%i==0)
            {
                sum=1;
            }
           
           }
          // System.out.print(sum);
           if(sum==0)
           {
            System.out.print("Yes");
           }
           else{
             System.out.print("no");
           }
    }
}
//7 2,3,4,5,6,