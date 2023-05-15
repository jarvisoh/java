import java.util.*;
class jss{
    public static String binary(int n)
    {
        int r=0;
        String w="";

        while(n>0)
        {
            r=n%2;

            w=r+""+w;
            n=n/2;
        }
           
            if(w.length()<4)
            {
                w="0"+w;

            }

        return w;
    }
    public static void main(String[] args)
    {
                int count=0;
        Scanner sc=new Scanner(System.in);
        int x=10;
        int y=7;
    String  m=binary(x);
      String n=binary(y);
    x=Integer.parseInt(m);
    y=Integer.parseInt(n);
while(x>0 || y>0)
{
    int r=x%10;
    int w=y%10;
  
    if(r!=w)
    {
          count++;
    }
    x=x/10;
    y=y/10;
}
System.out.print(count);

    }


}