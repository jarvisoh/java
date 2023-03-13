import java.util.*;
public class Str 
{

public static void main(String[] args)
{
     Scanner sc=new Scanner(System.in);
       
        String str=sc.nextLine();
        String str1=sc.nextLine();
        //int t=11;
     
     //   int brr[]=new int[t];
     //    int krr[]=new int[t];
         int count=0;
        int temp=0;
        int temp2=0;
        int length=0;
        char ch,ch1;
        char arr[]={'F','L','A','M','E','S'};
    
       
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
         for(int j=0;j<str1.length();j++)
        {
            ch1=str1.charAt(j);
            if(ch==ch1&&ch!=temp)
            {
               temp=str1.charAt(j);
               // str1.charAt(j)="@";
                count++;
                break;
            }

           
        }
        }
        length=str.length()+str1.length()-(2*(count));
         int  lengthct=length;
 for(int i=0;i<7;i++)

  {
  
    if(arr[length-1]!=0)
    {
          System.out.println("js"+arr[length-1]);
arr[length-1]=0;
length=(length-1)+lengthct;
if(length>6)
{
    length=length-5;
}
    }

    System.out.print(i);
    
  }
      for(int i=0;i<6;i++)
    {
        System.out.print(arr[i]);
        
    }

        
      //  System.out.print(length);
    
    /* for(int i=0;i<t;i++)
     {
            for(int j=i+1;j<t;j++)
            {
                if(arr[i]==arr[j])
                {
                    count=count+1;
                    arr[j]= i+1;
                   break;
                }
            }
        }
        System.out.print(count);*/
    }
}
