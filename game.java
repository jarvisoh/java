import java.util.*;
class jss{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
          
            int a=sc.nextInt();
              int arr[]=new int[a];
            int b=sc.nextInt();
            int count=0;
            for(int i=0;i<a;i++)
            {
               arr[i]=sc.nextInt(); 
            }
            for(int i=0;i<a;i++)
            {
                if(arr[i]==0)
                {
                    count=1;
                }
                else if(arr[i]>0)
                {
                    int j=0;
                      for(;j<b;j++)
                      {
                         if(a<=i)
                             {
                                count=1;
                                 break; 
                             }
                        if((arr[i]==1)&&(b!=0))
                        {
                         
                             //System.out.print("jk");
                            
                              i++;
                            
                        }
                        
                      
                      }
                        if(arr[j]!=arr[a-1])
                        {
                            //System.out.print("jk");
                            count=0;
                           break; 
                        }
                        //i++;
                      
                }
                else
                {
                    count=0;
                }
            }
            if(count>0)
            {
                System.out.print("Yes");
            }
            else
            {
                 System.out.print("No");
            }
        }

    }
}
