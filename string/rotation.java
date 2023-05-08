  
public class GFG {
  
    
    public static char[] lrotate(char[] ch)
    {
        int i=0;
int c;

c=ch.length;
char j;
char op=ch[0];
for(int k=0;k<c-1;k++)
{
j=ch[k];
ch[k]=ch[k+1];


}
ch[c-1]=op;


// ch[i]=ch.length();
for(char a:ch)
System.out.print(a);


        return ch;
    }
        
    public static char[] rrotate(char[] ch)
    {
        int i=0;
int c;

c=ch.length;
char j;
char op=ch[c-1];
for(int k=c-1;k>0;k--)
{
j=ch[k];
ch[k]=ch[k-1];


}
ch[0]=op;


// ch[i]=ch.length();
for(char a:ch)
System.out.print(a);


        return ch;
    }
    public static void main(String args[])
    {
        
        String str = "amazon";
        String temp="";
        String check="azonam";
        char js[]=str.toCharArray();
        // lrotate(js);
        // System.out.print("\n");
        //  lrotate(js);
        rrotate(js);
        System.out.print("\n");

        rrotate(js);



    

           
            

    }
}