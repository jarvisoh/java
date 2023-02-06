  
public class GFG {
  
    
    public static void main(String args[])
    {
        
        String str = "jothis@for@jothis";
        String[] arrOfStr = str.split(" @", 2);
  
        for (String a : arrOfStr)
            System.out.println(a);
    }
}