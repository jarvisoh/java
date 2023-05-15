import java.util.*;

class js{


    public static void main(String[] args)
    {
        String str="the world is mine";
        String str1="the earth is yours";

        char[] ks=str.toCharArray();
        char[] sk=str1.toCharArray();
        String temp="";

        Arrays.sort(ks);
        Arrays.sort(sk);
  
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str1.length();j++)
            {
                if((int)ks[i]==(int)sk[j])
                {
  ks[i]='0';
  sk[j]='0';
                  }


            }
        }
       for(char a:ks)
       {
        if(a!='0')
        {
        System.out.print(a);
        }
       }
         for(char a:sk)
       {
        if(a!='0')
        {
        System.out.print(a);
        }
       }
    }
}