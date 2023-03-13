import java.util.Scanner;
class j
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();

char[] a= s.toCharArray();
    
    check(a);
    check1(a);
    int count=0;
    for (char z:a)
    {
        if(z!=0)
        {

count++;

        }
    
        
    }
    System.out.println(count);
    }
    static void check(char []a){
    for(int i=0;i<a.length-1;i++)
    {

        if((a[i]=='a')&&(a[i+1]=='A')||(a[i]=='A')&&(a[i+1]=='a'))
        {
            a[i]=0;
            a[i+1]=0;
           
          
        }
        if((a[i]=='b')&&(a[i+1]=='B')||(a[i]=='B')&&(a[i+1]=='b'))
        {
            a[i]=0;
            a[i+1]=0;
            
        }
        if((a[i]=='c')&&(a[i+1]=='C')||(a[i]=='C')&&(a[i+1]=='c'))
        {
            a[i]=0;
            a[i+1]=0;
        }
        if((a[i]=='d')&&(a[i+1]=='D')||(a[i]=='D')&&(a[i+1]=='d'))
        {
            a[i]=0;
            a[i+1]=0;
        }
    }
    }

    static void check1(char[]a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==0)
            {
                if((a[i-1]=='a')&&(a[i+2]=='A')||(a[i-1]=='A')&&(a[i+2]=='a'))
        {
            a[i-1]=0;
            a[i+2]=0;
           
          
        }
        if((a[i-1]=='b')&&(a[i+2]=='B')||(a[i-1]=='B')&&(a[i+2]=='b'))
        {
            a[i-1]=0;
            a[i+2]=0;
            
        }
        if((a[i-1]=='c')&&(a[i+2]=='C')||(a[i-1]=='C')&&(a[i+2]=='c'))
        {
            a[i-1]=0;
            a[i+2]=0;
        }
        if((a[i-1]=='d')&&(a[i+2]=='D')||(a[i-1]=='D')&&(a[i+2]=='d'))
        {
            a[i-1]=0;
            a[i+2]=0;
        }
            }
        }
    }
}