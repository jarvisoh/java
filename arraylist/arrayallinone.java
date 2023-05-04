import java.util.*;
class js1{
 public static void main(String args[]){
 
  ArrayList<String> al=new ArrayList<String>();
  ArrayList<Integer> sl=new ArrayList<Integer>();
  Scanner sc=new Scanner(System.in);
  int n=1;
  while(n>0)
  {
  System.out.print("Enter the option\n 1.ADD\n 2.SET\n3.Display string\n4.display integer");
int ch=sc.nextInt();
switch(ch)
{
    case 1:
{
  System.out.print("Enter the option\n 1.String 2.Int");
  int option=sc.nextInt();
  if(option==1)
  {
      System.out.print("Enter the String ");
      sc.nextLine();
    String str=sc.nextLine();
    al.add(str);
  }
  else if(option==2)
  {
     System.out.print("Enter the integer ");
 int opt=sc.nextInt();
 sl.add(opt);
  }
  else
  {
    System.out.print("error");
  }
  break;
}

case 2:
    {
        System.out.print("Enter the option\n 1.String 2.Int");
  int option=sc.nextInt();
  if(option==1)
  {
      System.out.print("Enter the String ");
      sc.nextLine();
    String str=sc.nextLine();
    System.out.print("enter th position");
    int ks=sc.nextInt();
    al.set(ks,str);
  }
  else if(option==2)
  {
     System.out.print("Enter the Integer ");
int opt=sc.nextInt();
 System.out.print("enter th position");
    int ks=sc.nextInt();
 sl.set(ks,opt);
  }
  else
  {
    System.out.print("error");
  }

    }
    case 3:
        {
              for(String obj:al)
    System.out.println(obj);
 }
 case 4:
    {
          for(int obj:sl)
    System.out.println(obj);
 }
    }

    System.out.print("Do you want to continue press any number expt 0");
n=sc.nextInt();
  }
            
        }
//

//  //add
//  get
// set remove
//retain all
//add all
}