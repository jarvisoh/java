import java.io.*;
import java.util.Scanner;
  
class jss {
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
      
        
        String temp="";
        char ch,ch1,x='a';
        int v=0;
        int v1=0;
        int k=0;
        int l=2*t;
        
      //System.out.print("Original word: ");
     // System.out.println("hello"); 
  for(int o=0;o<l;o++)
      {
          String str= sc.nextLine();
         
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        temp= ch+temp; 
      } 
    //System.out.println("Reversed word: "+ temp);
    for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        ch1= temp.charAt(i);
        switch(ch)
      {
        case 'a':v=1;
        break;
        case 'b':v=2;
        break;
        case 'c':v=3;
        break;
        case 'd':v=4;
        break;
        case 'e':v=5;
        break;
        case 'f':v=6;
        break;
        case 'g':v=7;
        break;
        case 'h':v=8;
        break;
        case 'i':v=9;
        break;
        case 'j':v=10;
        break;
        case 'k':v=11;
        break;
        case 'l':v=12;
        break;
        case 'm':v=13;
        break;
        case 'n':v=14;
        break;
        case 'o':v=15;
        break;
         case 'p':v=16;
        break;
         case 'q':v=17;
        break;
         case 'r':v=18;
        break;
         case 's':v=19;
        break;
         case 't':v=20;
        break;
         case 'u':v=21;
        break;
         case 'v':v=22;
        break;
         case 'w':v=23;
        break;
         case 'x':v=24;
        break;
         case 'y':v=25;
        break;
         case 'z':v=26;
        break;

        default:v=0;


      }
      switch(ch1)
      {
        case 'a':v1=1;
        break;
        case 'b':v1=2;
        break;
        case 'c':v1=3;
        break;
        case 'd':v1=4;
        break;
        case 'e':v1=5;
        break;
        case 'f':v1=6;
        break;
        case 'g':v1=7;
        break;
        case 'h':v1=8;
        break;
        case 'i':v1=9;
        break;
        case 'j':v1=10;
        break;
        case 'k':v1=11;
        break;
        case 'l':v1=12;
        break;
        case 'm':v1=13;
        break;
        case 'n':v1=14;
        break;
        case 'o':v1=15;
        break;
         case 'p':v1=16;
        break;
         case 'q':v1=17;
        break;
         case 'r':v1=18;
        break;
         case 's':v1=19;
        break;
         case 't':v1=20;
        break;
         case 'u':v1=21;
        break;
         case 'v':v1=22;
        break;
         case 'w':v1=23;
        break;
         case 'x':v1=24;
        break;
         case 'y':v1=25;
        break;
         case 'z':v1=26;
        break;

        default:v=0;


      }

      //System.out.print(" "+ (v+v1));
       k=v+v1;
       if(k>26)
       {
        k=k-26;
       }
     // System.out.print(v+" ");
     

       switch(k)
      {
        case 1:x='a';
        break;
        case 2:x='b';
        break;
        case 3:x='c';
        break;
        case 4:x='d';
        break;
        case 5:x='e';
        break;
        case 6:x='f';
        break;
        case 7:x='g';
        break;
        case 8:x='h';
        break;
        case 9:x='i';
        break;
        case 10:x='j';
        break;
        case 11:x='k';
        break;
        case 12:x='l';
        break;
        case 13:x='m';
        break;
        case 14:x='n';
        break;
        case 15:x='o';
        break;
        case 16:x='p';
        break;
        case 17:x='q';
        break;
        case 18:x='r';
        break;
        case 19:x='s';
        break;
        case 20:x='t';
        break;
        case 21:x='u';
        break;
        case 22:x='v';
        break;
        case 23:x='w';
        break;
        case 24:x='x';
        break;
        case 25:x='y';
        break;
        case 26:x='z';
        break;

        
        default:v=0;


      }

      System.out.print(x);

    }
      }
}
}