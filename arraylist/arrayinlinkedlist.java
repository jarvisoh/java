import java.util.*;
class js1
{
    
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
   
TreeSet<String> al=new TreeSet<String>();
  al.add("ravi");
  al.add("vijay");
  al.add("ravi");
  al.add("vjay");

  //iterate in ascending order
    Iterator<String> itr =al.iterator();

    //iterate in descending order
   // Iterator<String> itr =al.descendingiterator();
    while(itr.hasNext())
    {
        System.out.println(itr.next());
    }
 
}

}