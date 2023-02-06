import java.util.*;
import java.lang.Math;
class jss{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       
        double t=30;
        int arr[]=new int[t];
                
        int m=Math.sqrt(t);
            for(int i=0;i<t;i++)
            {
               arr[i]=sc.nextInt(); 
             }
        System.out.print(m);

       

        }
    
}
