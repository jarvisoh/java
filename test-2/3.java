import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
 

     int a=sc.nextInt();
  
     int b=sc.nextInt();
     int m=0;
     int sum=0;int sum2=0;
    
     int arr[]=new int[b];
     
     for(int i=0;i<b;i++)
     {
         arr[i]=sc.nextInt();
     }
     
     for(int i=0;i<b;i++)
     {
        sum2=arr[i]+sum2;
         
     }
     for(int i=0;i<b;i++)
     {
        if(sum2==a)
        {
            if(i==1)
            {
        m=b*arr[i];
       // System.out.print(m);
        sum=m+sum;
            }
            else{
                 m=(b-1)*arr[i];
                sum=m+sum;
            }
     }
     }
    System.out.print(sum);
    
  

    }
}