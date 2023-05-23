import java.util.*;  
public class CountOccuranceOfChar1  
{  
public static void main(String args[])   
{  
String str;  
int i, len;  
int counter[] = new int[256];  
Scanner scanner = new Scanner(System.in);  
System.out.print("Please enter a string: ");  

str = scanner.nextLine();  
str=str.toLowerCase();

len = str.length();  

for (i = 0; i < len; i++)   
{  
    // System.out.print("=>"+(int)str.charAt(i)+" ");
counter[(int) str.charAt(i)]++;  
}  
int max=0;

for (i = 0; i < 256; i++)   
{  
if (counter[i] != 0)   
{  
//  if(count)
// System.out.println((char) i + " --> " + counter[i]);  
if(counter[i]>max)
max=counter[i];
}  
} 
 System.out.println(max);
//  for (i = 0; i < 256; i++)   
// {  
// if (counter[i] != 0)   
// {  
// //  if(count)
// // System.out.println((char) i + " --> " + counter[i]);  
// if(counter[i]>=max)
// {
//     System.out.println((char) i + " --> " + counter[i]); 
//     max=max-1;

// }
// }  
// }   
while(len>0)
{
     for (i = 0; i < 256; i++)   
{  
if (counter[i] != 0)   
{ 
    if(counter[i]==max)
{
    System.out.println((char) i + " --> " + counter[i]); 
   
    len=len-1;

}
}}
 max=max-1;

}
}  
} 