import java.util.*;  
class UserInputDemo1  
{  
public static void main(String[] args)  
{  



int arr[][]={{3,4,5},{6,7,8},{1,2,3}};
for(int i=0;i<3;i++)
{
    int max=0;
    for(int j=0;j<3;j++)
    {
        // System.out.print(arr[i][j]+" ");
        if(max<arr[i][j])
        {
            max=arr[i][j];
        }
    }
        System.out.println(max);

}

}
    }