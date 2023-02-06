import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
 

    
       int arr [ ][ ][ ]={
    {
        {1,2,3},
    {1,3,2}
    },
   { 
    {2,1,3},
    {2,3,1}
    },
   { 
    {3,1,2},
    {3,2,1}
    },
    };
    int arr1[][][] = new int[3][3][3];
 System.out.print("nums =");

 
            arr1[0][0][0]=sc.nextInt();
            

for (int i=0;i<1;i++)
{
    for (int j=0;i<1;j++)
    {
        for (int k=0;k<1;k++)
        {   
            if(arr[i][j][k]==arr1[0][0][0])
            {
                System.out.print(arr[i+1][j+1][k+1]);
            }
            
        }
    }
}

    }
}