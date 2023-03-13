
  import java.util.*;
class jss {

public static void main(String[] args)
{

    int[] arr={5,4,2,3,1};
    char[] brr={'a','b','z','x','y','r'};
  
 Arrays.sort(arr);
  Arrays.sort(brr);
    for(int a :arr)
    {
        System.out.print(a+" ");
    }
    System.out.println();
    System.out.println(brr.toString());
    System.out.print(brr);
  
      for(char a :brr)
    {
        System.out.print(a+" ");
    }
}
}