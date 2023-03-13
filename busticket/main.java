
import java.util.*;
class passenger{
   int custid=0,busid=0,buses;
   int custmerid;
   String str,from,to,bus;
   int num,ticket,busno;
  double stime,etime;
void create()
{
Scanner sc=new Scanner(System.in);
    System.out.print("Name");
   str=sc.nextLine();

    System.out.print("contact");
    num=sc.nextInt();
custid++;
custmerid=custid;


}
void display()
{
      System.out.println("Name:"+str);
  System.out.println("contact:"+num);
    System.out.println("custmerid:"+custmerid);
   
}

}
class bus extends passenger{
    void addbus()
    {
        Scanner sc=new Scanner(System.in);
    System.out.println("Name of bus :");
    bus=sc.nextLine();

    System.out.println("From:");
    from=sc.nextLine();
    System.out.println("TO:");
   to=sc.nextLine();
    System.out.println("starting time:");
    stime=sc.nextDouble();
    System.out.println("ending time:");
    etime=sc.nextDouble();
    busid++;
    buses=busid;
      System.out.println("ticket:");
      ticket=sc.nextInt();
     // static Queue<Integer> waitingList = new LinkedList<>();


    }
}
class display extends bus
{
void busdisplay()
{
     System.out.print("Name of bus "+bus);

    System.out.println("From"+from);

    System.out.println("TO"+to);

    System.out.println("starting time"+stime);

    System.out.println("ending time"+etime);

    System.out.println("available ticket"+ticket);

}
}
class booking extends bus
{
    void booking()
    {
Scanner sc=new Scanner(System.in);
  System.out.println("From:");
    from=sc.nextLine();
    System.out.println("TO:");
   to=sc.nextLine();
    System.out.print("Name");
   str=sc.nextLine();

    System.out.print("contact");
    num=sc.nextInt();
      System.out.println("busnumber:");
      busno=sc.nextInt();


    }
}


class main{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
      display b= new display();
        b.create();
        b.display();
        b.addbus();
        b.busdisplay();

//static Queue<Integer> waitingList = new LinkedList<>();
    
    }
}
