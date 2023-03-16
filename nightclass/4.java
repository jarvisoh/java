import java.util.*; 
class Matrix
{
    void display(int c,int r,int crr[][]){

    
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


class input extends Matrix{
  
    void read_input(int c,int r,int arr[][]) 
    {
      Scanner sc= new Scanner(System.in);
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
    
 arr[i][j]=sc.nextInt(); 
}
} 
    }
 void read_input2(int c1,int r1,int brr[][]) 
    {
      Scanner sc= new Scanner(System.in);
for(int i=0;i<r1;i++)
{
for(int j=0;j<c1;j++)
{
    
 brr[i][j]=sc.nextInt(); 
}
} 
}
}

class cal extends input{
void read_input3(int c1,int r1,int brr[][],int arr[][],int crr[][])
{ 
for(int i=0;i<r1;i++)
{
for(int j=0;j<c1;j++)
{
    crr[i][j]=arr[i][j]+brr[i][j];
}
}
}
void read_input4(int c1,int r1,int brr[][],int arr[][],int drr[][])
{ 
for(int i=0;i<r1;i++)
{
for(int j=0;j<c1;j++)
{
    drr[i][j]=arr[i][j]*brr[i][j];
}
}
}
}

class js1{
    public static void main(String[] args)
    {
            Scanner sc= new Scanner(System.in);
        cal ca=new cal();
   int[][] arr;
int[][] brr; //System.in is a standard input stream  
int[][] crr;
int[][] drr;
int r=sc.nextInt(); 
int c=sc.nextInt();
arr= new int[r][c];

ca.read_input(c,r,arr);
int r1=sc.nextInt(); 
int c1=sc.nextInt();
brr= new int[r1][c1];
crr= new int[r][c];
drr= new int[r][c];
ca.read_input2(c1,r1,brr);
if(r1==c)
{
ca.read_input3(c1,r1,brr,arr,crr);

ca.read_input3(c1,r1,brr,arr,drr);
ca.display(c1,r1,crr);
System.out.println();
System.out.println();
ca.display(c1,r1,drr);
}
else
{
    System.out.println("Matrices cannot be added");

     
    }
}
}