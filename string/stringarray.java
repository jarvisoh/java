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
    public static void main(String[] args)
    {
        String[] arr={"world","hello","class","ko","world","hello"};
        int x=arr.length;

      int count[]=new int[x];
        for(int i=0;i<arr.length;i++)
        {
         
            for(int j=i+1;j<arr.length;j++)
        {

           if(arr[i].equals(arr[j]))
           {
        count[i]++;
          // count[j]++;
           }
     
        }

        }

        int num=0;
              for(int j=0;j<arr.length;j++)

{

    if(count[j]>0)
    {
        num++;
    }
}
String[] dub=new String[num];
int pos=0;
for(int j=0;j<arr.length;j++)
{

    if(count[j]>0)
    {
        dub[pos]=arr[j];
        pos++;
    }
}
// Arrays.sort(dub);

dub=sortt(dub);

for(String s:dub)
{
    System.out.print(s);
}

    }
}