import java.util.*;
class jss{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       
        int t=sc.nextInt();
        int arr[]=new int[t];
                
        int count=100;
            for(int i=0;i<t;i++)
            {
               arr[i]=sc.nextInt(); 
            
            if(count>=arr[i])
            {
            count=arr[i];
            }
            }
            System.out.print(count);



        
    }
}