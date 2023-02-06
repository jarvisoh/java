import java.util.*;  
class UserInputDemo1  
{  
public static void main(String[] args)  
{  
 //System.in is a standard input stream  
//System.out.println("\t"+"H"+"\t"+"E"+"\t"+"E"+"\t"+"L"+"\t"+"o"); 
Scanner sc= new Scanner(System.in);
int[][] arr;
int sum=0; //System.in is a standard input stream  
int r=sc.nextInt(); 
int c=sc.nextInt(); 
arr= new int[r][c];

for(int i=0;i<r;i++)
{
   // System.out.print(sum); 
   // sum=0;
for(int j=0;j<c;j++)
{
    
 arr[i][j]=sc.nextInt(); 
 if(i==j)

sum=sum+arr[i][j];
}
}

 System.out.println(sum); 
}

  // System.out.print(sum); 
  }

