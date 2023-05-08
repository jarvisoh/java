      import java.util.*;
public class Str 
{

 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
  String str = sc.nextLine();
//   str=str.toLowerCase(); 
  String str2=sc.nextLine();
  int m=0;
int count=1;
  int n=str.length();
//   char arr[]=new char[str.length()];
char js[]=str.toCharArray();
char js1[]=str2.toCharArray();
if(str.contains(str2))
{
    // int x=str.indexOf(str2);
    // int y=str2.length();
    // // System.out.print(str.indexOf(str2));
    // str.replace(0,1);

    // System.out.print(str);

    
    // remove first occurenxe of a string froma sentence


    for(int i=0;i<n;i++)
    {
        // System.out.print(js[i]);
        if((js[i]==js1[m])&&(count==1))
        {
            
// System.out.print("->"+js[i]);
m++;
if(m>=str2.length())
{
    m=0;
count=2;
}
        }
        else
        {
            m=0;
            System.out.print(js[i]);
        }
    }


}



 }


}