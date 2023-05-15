import java.util.*;
class js{
        

        public static String[] sortt(String[] arr)
{
    char ch,chh;
for(int i=0;i<arr.length;i++)
{
    
ch=arr[i].charAt(0);

for(int j=0;j<arr.length;j++)
{
chh=arr[j].charAt(0);

if((int)ch<(int)chh)
{
    String temp;
    temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
}
}
    return arr;
}
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
            String str= "this is a class is a class";
            String[] js=str.split(" ");

js=sortt(js);

for(int i=0;i<js.length;i++)
{
for(int j=i+1;j<js.length;j++)
{

        if(js[i].equals(js[j]))
        {
            System.out.print(" "+js[i]);
        }
}
}


    }
}