import java.util.*;

class jss{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

       int num=sc.nextInt();

        int val=1,idcount=0,rep,inc,dec,row;
        val=num;
      for(row=1;row<=(2*num)-1;row++)
      {
        for(dec=1;dec<=idcount;dec++)
        {
            System.out.print(val--);
        }
        for(rep=1;rep<=((2*num)-1)-2*idcount;rep++)
        {
            System.out.print(val);

        }
        for(inc=1;inc<=idcount;inc++)
        {
            System.out.print(++val);
        }
            if(row>=num)
            {
            idcount--;
            }
            else
            {
            idcount++;
            }
            if(row<(2*num)-1)
            {
            System.out.println();
            }
        
        
      }
    


}  
    }


