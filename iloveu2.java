import java.io.*;
import java.util.Scanner;
  
class jss {
    public void hs(int i){

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
    
    public void ls(int i)
    {
     
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
     public void is(int i)
    { 
       
          
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
    
 public void os(int i)
    { 
         
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
    
     public void oss(int i)
    { 
           
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
    
     public void us(int i)
    { 
           
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
    
    public void es(int i)
    { 
           
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
    public void vs(int i)
    {

    for(int j=0;j<=7;j++)
{
    if((i==j)&&(i<=4)||(i+j==7))
    {
    System.out.print("*");
    }
    else
    {
        System.out.print(" ");
    }
}
    }

    public void ys(int i)
    {
         { 
         
           
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
    for( i=2;i<3;i++)
        {
         
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
for( i=3;i<=4;i++)
        {
          
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

    }
    }
     public void starr()
    {
        for(int i=0;i<5;i++)
        {
            System.out.print(" ");
        }
    }
    
     public void space()
    {
        for(int i=0;i<2;i++)
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
      for(int j=0;j<5;j++)
      {
        System.out.print("\n");
        for (int i=0;i<str.length();i++)
      {
          ch= str.charAt(i); 
switch(ch)
{
      case 'h':ks.hs(j);
      
      break;
      case 'i':ks.is(j);
       ks.space();
       ks.space();
       ks.space();
       ks.space();
       
      break;
      case 'l':ks.ls(j);
      ks.space();
      break;
      case 'o':ks.os(j);
       ks.space();
      break;
      case 'v':ks.vs(j);
       ks.space();
      break;
      
      case 'e':ks.es(j); 
       ks.space();
       ks.space();
       ks.space();
       ks.space();
      break;
      case 'y':ks.ys(j); 
       ks.space();
      break;
      
      //case 'o':ks.oss();
      //break;
      case 'u':ks.us(j); 
       ks.space();
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
}