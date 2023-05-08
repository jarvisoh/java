import java.util.*;
class js{

    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int count=2;
    char c='A';
   int x=0;
    char a[]=str.toCharArray();
    if(str.length()>8)
    {
    for(int i=0;i<str.length();i++)
    {
        System.out.print((int)a[i]+" ");
        if(((int)a[i]>58)&&((int)a[i]<64))
        {
           count=0;
    
        }
        if(((int)a[i]>64)&&((int)a[i]<81))
        {
            count=1;
         
        }
        if(((int)a[i]>47)&&((int)a[i]<58))
            {
                x=x+1;
            }

    }

   if((count==1)&&(x==2))
        {
             System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }

    }
    }


}