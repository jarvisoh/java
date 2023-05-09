import java.util.*;

class GFG{



public static void printjs(String js,int low,int high)
{
    for(int i=low;i<=high;i++)
    {
        System.out.print(js.charAt(i));
    }
}
public static void calc(String js)
{
    int max=0,low=0;
    for(int i=0;i<js.length();i++)
    {
        
    
        for(int j=i;j<js.length();j++)
        {
                int flag=1;
            for(int k=0;k<(j-i+1)/2;k++)
            {
                if(js.charAt(i+k)!=js.charAt(j-k))
                flag=0;
            }
                if(flag!=0&&max<(j-i+1))
                {
                    low=i;
                    max=j-i+1;

             }
            

        }
   

       
    } 
    printjs(js,low,(low+max-1));

}
public static void main(String[] args)
{
    String str="jothiswaran";
    calc(str);
}
}