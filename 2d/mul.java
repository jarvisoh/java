import java.util.*;  
class UserInputDemo1  
{  
public static void main(String[] args)  
{  
 //System.in is a standard input stream  
//System.out.println("\t"+"H"+"\t"+"E"+"\t"+"E"+"\t"+"L"+"\t"+"o"); 
Scanner sc= new Scanner(System.in);
int[][] arr;
int[][] brr; //System.in is a standard input stream  
int[][] crr;

int r=sc.nextInt(); 
int c=sc.nextInt(); 
arr= new int[r][c];

for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
    
 arr[i][j]=sc.nextInt(); 
}
}
System.out.print("enter the second array\n");
int r1=sc.nextInt(); 
int c1=sc.nextInt(); 
brr= new int[r1][c1];
crr= new int[r1][c1];
for(int i=0;i<r1;i++)
{
for(int j=0;j<c1;j++)
{
    
 brr[i][j]=sc.nextInt(); 
}
}
System.out.print("mUlplication the addition array\n");
if(r1==c)
{
for(int i=0;i<r1;i++)
{
for(int j=0;j<c1;j++)
{
    crr[i][j]=arr[i]+brr[j];
}
}

for(int i=0;i<r;i++)
{
    System.out.print("\n");
for(int j=0;j<c;j++)
{
    
   System.out.print(" "+crr[i][j]); 
}
}
}
}
}
