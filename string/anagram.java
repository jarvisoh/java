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
   int flag=0;
if(str.length()==str1.length())
{
   for(int i=0;i<str1.length();i++)
{

if(arr[i]!=arr1[i])
{
  flag=1;
}
else
{
    flag=2;
}
}
}
System.out.print(flag==2 ? "yes":"no");


}
}