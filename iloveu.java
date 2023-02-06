import java.io.*;
import java.util.Scanner;
  
class jss {
    public void hs(){
for(int i=0;i<5;i++)
{System.out.print("\n");
        for(int j=0;j<5;j++)
        {
            if((j==0)||(j==4)||(i==2))
            {
            System.out.print("*");
        }
        else
        {
            System.out.print(" ");
        }
}
    }
    }
    public void ls()
    {
        for(int i=0;i<5;i++)
        {
            System.out.print("\n");
        for(int j=0;j<5;j++)
        {
           if((j==0)||(i==4))
            {
            System.out.print("*");
        }
        else
        {
            System.out.print(" ");
        }

}

    }
    }
     public void is()
    { 
        for(int i=0;i<5;i++)
        {
            System.out.print("\n");
        for(int j=0;j<5;j++)
        {
           if((i==0)||(i==4)||(j==2))
            {
            System.out.print("*");
        }
        else
        {
            System.out.print(" ");
        }

        }
}
    }
 public void os()
    { for(int i=0;i<5;i++)
        {
            System.out.print("\n");
        for(int j=0;j<5;j++)
        {
           if((i==0)||(i==4)||(j==0)||(j==4))
            {
            System.out.print("*");
        }
        else
        {
            System.out.print(" ");
        }

}
        }
    }
     public void oss()
    { for(int i=0;i<5;i++)
        {
            System.out.print("\n");
        for(int j=0;j<5;j++)
        {
           if((i==0)||(i==4)||(j==0)||(j==4))
            {
            System.out.print("*");
        }
        else
        {
            System.out.print(" ");
        }

}
        }
    }
     public void us()
    { for(int i=0;i<5;i++)
        {
            System.out.print("\n");
        for(int j=0;j<5;j++)
        {
           if((i==4)||(j==0)||(j==4))
            {
            System.out.print("*");
        }
        else
        {
            System.out.print(" ");
        }

}
        }
    }
    public void es()
    { for(int i=0;i<5;i++)
        {
            System.out.print("\n");
        for(int j=0;j<5;j++)
        {
           if((i==0)||(i==4)||(j==0)||(i==2))
            {
            System.out.print("*");
        }
        else
        {
            System.out.print(" ");
        }

}
        }
    }
public void vs()
    { for(int i=0;i<2;i++)
        {
            System.out.print("\n");
        for(int j=0;j<5;j++)
        {
           if((j==0)||(j==4))
            {
            System.out.print("*");
        }
        else
        {
            System.out.print(" ");
        }

}

    }
    for(int i=2;i<3;i++)
        {
            System.out.print("\n");
        for(int j=0;j<5;j++)
        {
           if((j==1)||(j==3))
            {
            System.out.print("*");
        }
        else
        {
            System.out.print(" ");
        }

}
        }
for(int i=3;i<4;i++)
        {
            System.out.print("\n");
        for(int j=0;j<5;j++)
        {
           if((j==2))
            {
            System.out.print("*");
        }
        else
        {
            System.out.print(" ");
        }

}

    }}
    public void ys()
    {
         { for(int i=0;i<1;i++)
        {
            System.out.print("\n");
        for(int j=0;j<5;j++)
        {
           if((j==0)||(j==4))
            {
            System.out.print("*");
        }
        else
        {
            System.out.print(" ");
        }

}

    }
    for(int i=2;i<3;i++)
        {
            System.out.print("\n");
        for(int j=0;j<5;j++)
        {
           if((j==1)||(j==3))
            {
            System.out.print("*");
        }
        else
        {
            System.out.print(" ");
        }

}
        }
for(int i=3;i<=4;i++)
        {
            System.out.print("\n");
        for(int j=0;j<5;j++)
        {
           if((j==2))
            {
            System.out.print("*");
        }
        else
        {
            System.out.print(" ");
        }

}

    }}
    }
     public void starr()
    {
        for(int i=0;i<5;i++)
        {
            System.out.print(" ");
        }
    }
    
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
       
    
      char ch1,ch;
      int count=0,count2=0;
     
       
       
       jss ks=new jss();
  
     

       String str=sc.nextLine();
        for (int i=0;i<str.length();i++)
      {
          ch= str.charAt(i); 
switch(ch)
{
      case 'h':ks.hs();
       System.out.print("---------------------");
      break;
      case 'i':ks.is();System.out.print("\n");
      break;
      case 'l':ks.ls();System.out.print("\n");
      break;
      case 'o':ks.os();System.out.print("\n");
      break;
      case 'v':ks.vs(); System.out.print("\n");
      break;
      
      case 'e':ks.es(); System.out.print("\n");
      break;
      case 'y':ks.ys(); System.out.print("\n");
      break;
      
      //case 'o':ks.oss();
      //break;
      case 'u':ks.us(); System.out.print("\n");
      break;
      default:
      System.out.print("nothing");
      break;
      
}
       
           
     
            //System.out.print(count);
          //ount2=str.length()-count;
         

    
     
      }
}
}