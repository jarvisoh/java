import java.util.*;
  
class jss {

public static void main(String[] args)
{
    int[] arr={1,2,3,4,5};
    int[] brr={1,2,3,4,5};
    int n=5;
        System.out.println("equal:"+ Arrays.equals(arr,brr));
        System.out.print("find:"+Arrays.binarySearch(arr,n));

    
}
}