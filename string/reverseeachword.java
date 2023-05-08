  
public class GFG {
  
    
    public static void main(String args[])
    {
        
        String str = "jothis for me";
        String[] strsp = str.split(" ");

  char ch;
        for (int i=strsp.length-1;i>=0;i--)
        {
              String temp="";
        // System.out.print(strsp[i] +" ");
        int x=strsp[i].length();
        // System.out.print(x +" ");


        for(int j=0;j<x;j++)
        {
            ch=strsp[i].charAt(j);
            temp=ch+temp;
              
        }
        System.out.print(temp +" ");
        }
           
            

    }
}