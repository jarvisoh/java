import java.util.*;
class js{

    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String str1=sc.nextLine();
    char arr[]=str.toCharArray();
    char arr1[]=str1.toCharArray();
    Arrays.sort(arr);
    Arrays.sort(arr1);
    int count=0,count1=0;

for(int i=0;i<str1.length();i++)
{
if(arr[i]==arr1[i])
{
   count++;
}
}
System.out.print(count);
    
}
}