import java.util.*;
class jss{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=1;
              int n=sc.nextInt();
       
 
       for(int j=1;j<=n;j++)
       {
      
        sum*=j;

       }
       System.out.print(sum);
       
    }
}