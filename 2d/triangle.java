import java.util.*;  
class UserInputDemo1  
{  
public static void main(String[] args)  
{  

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
 
}
}

for(int i=0;i<r;i++)
{
   
    
    System.out.print("\n");
 

for(int j=0;j<c;j++)
{
   
   if(j+i<=2)
  System.out.print(" "+arr[i][j]); 
  else
  System.out.print("  "); 
    
}
   
}
}

  // System.out.print(sum); 
  }

