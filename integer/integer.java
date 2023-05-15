import java.util.*;
class jss{
    public static int binary(int n)
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
 System.out.println(w);
            }

        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=10;
        int y=7;
       x=binary(x);
       y=binary(y);
    if()

    }


}