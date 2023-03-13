import java.util.*;
class js{

    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    
    char arr[]=str.toCharArray();
    
   Arrays.sort(arr);
  int count=0;


   for(int i=0;i<str.length();i++)
{
    for(int j=0;j<str.length();j++)
    {
        if(arr[i]==arr[j])
        {
            count++;
        }
    }

}//System.out.print(count);
System.out.print(count==str.length() ? "ISOGRAM":"NO");


}
}