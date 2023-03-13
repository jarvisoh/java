import java.util.*;
class jss{
    public int score(char x)
    {
        int score=0;
        if(x=='A'||x=='X')
        {
            score=1;
        }
        else if(x=='B'||x=='Y')
        {
            score=2;
        }
       else if(x=='Z'||x=='C')
        {
            score=3;
        }
        else
        {
            score=0;
        }
        return score;
    }
public static void main(String[] args)

{

    Scanner sc=new Scanner(System.in);
    int n=1;
    int win=6,loss=0,draw=3;
  
    int sum=0;
    jss js=new jss();
    while(n!=0)
    {
          int s2=0;
        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);
          if(js.score(a)<js.score(b))
          {
           s2=win+js.score(b);
            }
        else if(js.score(a)>js.score(b))
          {
           s2=loss+js.score(b);
            }
            else
            {
                s2=draw+js.score(b);
                n=0;
            }
           // System.out.print(s2);
            sum+=s2;

    }
System.out.print(sum);
}
}