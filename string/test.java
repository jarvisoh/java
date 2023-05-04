import java.util.Scanner;  
public class CountOccuranceOfChar1  
{  
public static void main(String args[])   
{  
String str;  
int i, len;  
int counter[] = new int[256];  

Scanner scanner = new Scanner(System.in);  
// System.out.print("Please enter a string: ");  
//reading a string from the user  
str = scanner.nextLine();  
//finds the length of the string  
len = str.length();  
char ch[]=new char[len];
char ks;
// loop through the string and count frequency of every character and store it in counter array  
for (i = 0; i < len; i++)   
{  
    // System.out.print("=>"+(int)str.charAt(i)+" ")q;
counter[(int) str.charAt(i)]++;  
}  
// for (i = 0; i < 256; i++)   
// {  
// if(counter[i]==1)
// {
//     System.out.print((char)i);
// }
// else
// {
//     System.out.print("#");
// }
// }
int k=0;
int n=0;
while(256>k)
{
    if(counter[k]==1)
    {
        ch[n]=(char)k;
        n++;
     
    }
    k++;
}
for (i = 0; i < len; i++)   
 { 
    ks=str.charAt(i);
    
    System.out.print(str.contains(ks));

}


}
}