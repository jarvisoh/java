import java.util.*;
class js{

    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    //String str1=sc.nextLine();
    char arr[]=str.toCharArray();
  //  char arr1[]=str1.toCharArray();
  //  Arrays.sort(arr);
   // Arrays.sort(arr1);
   int flag=0,flag1=0,flag2=0,flag3=0;

for(int i=0;i<str.length();i++)
{
if((arr[i]>96)&&(arr[i]<123))
{
  flag=1;
}
if((arr[i]>64)&&(arr[i]<91))
{
  flag1=1;
}
if(((arr[i]>33)&&(arr[i]<47))||(arr[i]==64))
{
  flag2=1;
}
if((arr[i]>47)&&(arr[i]<58))
{
  flag3=1;
}
}

System.out.print(((flag==1)&&(flag1==1)&&(flag2==1)&&(flag3==1)) ?"Strong password":"Weak password");
    
}
}